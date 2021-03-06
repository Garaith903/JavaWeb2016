package com.spring.henallux.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.CartDAO;
import com.spring.henallux.dataAccess.dao.LineProductDAO;
import com.spring.henallux.dataAccess.dao.ProductDAO;
import com.spring.henallux.dataAccess.dao.PromotionDAO;
import com.spring.henallux.model.Cart;
import com.spring.henallux.model.CartForm;
import com.spring.henallux.model.LineProduct;
import com.spring.henallux.model.LoginForm;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.ProductCart;
import com.spring.henallux.model.Promotion;
import com.spring.henallux.model.UserInscriptionForm;

@Controller
@RequestMapping(value="/cart")
@SessionAttributes({"currentUser","currentCart"})
public class CartController {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private PromotionDAO promotionDAO;
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private LineProductDAO lineProductDAO;

	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, @ModelAttribute(value="currentUser") LoginForm user, @ModelAttribute(value="currentCart") CartForm currentUsercart, Locale locale)
	{
		int numberOfWeek;
		Calendar calendar = new GregorianCalendar();
		Date trialTime = new Date();   
		calendar.setTime(trialTime);     
		numberOfWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		String keyOfPromo = "week"+((numberOfWeek<10)?"0":"")+numberOfWeek;
		
		Promotion promotionOfTheWeek = promotionDAO.getThePromoOfTheCurrentWeek(keyOfPromo);
		
		if(promotionOfTheWeek != null)
		{
			 Iterator<Integer> keySetIterator = currentUsercart.getCart().keySet().iterator(); 
	         
	         while(keySetIterator.hasNext())
	         { 
	         	Integer keyIn = keySetIterator.next();
	         	
	         	if(currentUsercart.getCart().get(keyIn).getProduct().getIdcateg().equals(promotionOfTheWeek.getIdcategprod()))
	         	{
	         		currentUsercart.getCart().get(keyIn).setDiscount(promotionOfTheWeek.getPromotionofweek());
	         	}
	         }
		}

		model.addAttribute("productcartform", currentUsercart);
		
		return "integrated:mycart";
	}
	
	@RequestMapping(value="/updatedcart", method=RequestMethod.GET)
	public String home(Model model, HttpServletRequest request, Locale locale)
	{
		CartForm cart = (CartForm)request.getSession().getAttribute("currentCart");

		model.addAttribute("productcartform", cart);
		
		return "integrated:mycart";
	}
	

	@RequestMapping(value="/updatequatity", method=RequestMethod.POST)
    public String shoppingCartUpdateQty(HttpServletRequest request, Model model,@ModelAttribute(value="productcartform") CartForm cartFormUpdate, Locale locale)
	{
		CartForm cart = (CartForm)request.getSession().getAttribute("currentCart");
		
		cart.updateQuantity(cartFormUpdate);
		model.addAttribute("productcartform", cart);

        return "redirect:/cart/updatedcart";
	}
	
	
	
	@RequestMapping(value="/CartRemoveProduct")
    public String removeProductHandler(HttpServletRequest request, Model model, @RequestParam(value = "idproducttoremove", defaultValue = "") String idProdRemove)
	{
        Product product = null;

        if (idProdRemove != null && idProdRemove.length() > 0) 
        {
            product = productDAO.getOneProductById(idProdRemove);
        }
        if (product != null) 
        {
            CartForm cart = (CartForm)request.getSession().getAttribute("currentCart");

            Integer key = null;
            
            Iterator<Integer> keySetIterator = cart.getCart().keySet().iterator(); 
            
            while(keySetIterator.hasNext())
            { 
            	Integer keyIn = keySetIterator.next();
            	cart.getCart().get(keyIn);
            	
            	if(cart.getCart().get(keyIn).getProduct().getIdproduct().equals(idProdRemove))
            	{
            		key = keyIn;
            	}
            }
            if(key != null)
            {
            	cart.getCart().remove(key);
            }
        }
        return "redirect:/cart/updatedcart";
    }
	
	@RequestMapping(value="/ConfirmCart")
	public String confirmUserCart(HttpServletRequest request, Model model, @ModelAttribute(value="productcartform") CartForm cartFormConfimed, Locale locale)
	{		
		int idCartToSave = cartDAO.getTheNumberOfCarts()+1;
		int idLineToSave = lineProductDAO.getTheNumberOfLines();
		
		Cart cartToSave = new Cart();
		cartToSave.setIdcart(idCartToSave);
		cartToSave.setOrderdate(new java.util.Date());
		cartToSave.setIdperson(cartFormConfimed.getUserId());
		
		cartDAO.saveCart(cartToSave);
		
		ArrayList<LineProduct> lineProductToSave = new ArrayList<LineProduct>();
		Iterator<Integer> keySetIterator = cartFormConfimed.getCart().keySet().iterator(); 

		while(keySetIterator.hasNext())
		{
			idLineToSave++;
			Integer keyIn = keySetIterator.next();
			LineProduct line = new LineProduct();
			line.setIdlineproduct(idLineToSave);
			line.setQuantity(cartFormConfimed.getCart().get(keyIn).getQuantity());
			line.setDiscount(cartFormConfimed.getCart().get(keyIn).getDiscount());
			line.setIdcartperson(idCartToSave);
			line.setIdproduct(cartFormConfimed.getCart().get(keyIn).getProduct().getIdproduct());
			
			lineProductToSave.add(line);
		}
		lineProductDAO.SaveLineProduct(lineProductToSave);
		
		return "integrated:home"; 
	}
}
