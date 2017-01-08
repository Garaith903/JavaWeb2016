package com.spring.henallux.controller;

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

import com.spring.henallux.dataAccess.dao.ProductDAO;
import com.spring.henallux.model.CartForm;
import com.spring.henallux.model.LoginForm;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.ProductCart;
import com.spring.henallux.model.UserInscriptionForm;

@Controller
@RequestMapping(value="/cart")
@SessionAttributes({"currentUser","currentCart"})
public class CartController {
	
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, @ModelAttribute(value="currentUser") LoginForm user, @ModelAttribute(value="currentCart") CartForm currentUsercart, Locale locale)
	{
		int numberOfWeek;
		Calendar calendar = new GregorianCalendar();
		Date trialTime = new Date();   
		calendar.setTime(trialTime);     
		numberOfWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		logger.info("Numero de la semaine "+numberOfWeek);
		
		HashMap<Integer, ProductCart> cartU = new HashMap<Integer, ProductCart>();
		cartU.put(1, new ProductCart(new Product("board01","Arduino NANO", "ATmega168", 5, 7, 20, 14, 8, 6, 40, 32, 2, 16, null, null, null, 33.00, 18.00, 6.00, 15.00, 100,"cbasique"), 12, "A000011_featured"));
		cartU.put(2, new ProductCart(new Product("board02", "Arduino MICRO", "ATmega32U4", 5, 7, 20, 20, 12, 0, 20, 32, 2.50, 16, null, null, null, 48.00, 18.00, 13.00, 18.00, 100, "cbasique"), 13, "A000011_featured"));
		
		currentUsercart.setCart(cartU);
		currentUsercart.setUserId("Julien");

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
		logger.info("CART GLOBAL "+cart.getUserId()+cart.getAmountTotal());
		
		/////////////////////////////
		 Iterator<Integer> keySetIterator = cartFormUpdate.getCart().keySet().iterator(); 
         
         while(keySetIterator.hasNext())
         { 
         	Integer keyIn = keySetIterator.next();
         	logger.info("IDPRODUCT "+cartFormUpdate.getCart().get(keyIn).getQuantity());
         	logger.info("IDPRODUCT "+cartFormUpdate.getCart().get(keyIn).getProduct().getIdproduct());
         	
         }
		/////////////////////////////
		
		cart.updateQuantity(cartFormUpdate);
		model.addAttribute("productcartform", cart);

        return "redirect:/cart/updatedcart";
	}
	
	
	
	@RequestMapping(value="/CartRemoveProduct")
    public String removeProductHandler(HttpServletRequest request, Model model, @RequestParam(value = "idproducttoremove", defaultValue = "") String idProdRemove) {
        Product product = null;

        if (idProdRemove != null && idProdRemove.length() > 0) {
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
	
}
