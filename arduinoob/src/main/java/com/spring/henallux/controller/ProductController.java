package com.spring.henallux.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.TranslationCategoryDAO;
import com.spring.henallux.model.CartForm;
import com.spring.henallux.model.CategoryForm;
import com.spring.henallux.model.ProductCart;

@Controller
@RequestMapping(value="/product")
@SessionAttributes({"currentUser","currentCart", "selectedProductToAdd"})
public class ProductController 
{

	@Autowired
	private MessageSource messageSource;
	@Autowired
	private TranslationCategoryDAO categoryDAO;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model,HttpServletRequest request, @ModelAttribute(value="selectedProductToAdd")ProductCart productCart, Locale locale)
	{
		ProductCart cart = (ProductCart)request.getSession().getAttribute("selectedProductToAdd");
		model.addAttribute("productCartDisplayed",productCart);
		return "integrated:product";
	}
	
	@RequestMapping(value="/sendProduct", method=RequestMethod.POST)
	public String productToAdd(Model model,HttpServletRequest request, @ModelAttribute(value="productCartDisplayed")ProductCart ProdChosen, Locale locale)
	{
		if(ProdChosen.getQuantity() <= 0 || ProdChosen.getQuantity() > ProdChosen.getProduct().getQuantity())
		{
			if(ProdChosen.getQuantity() <= 0)
			{
				model.addAttribute("wrongquantity", messageSource.getMessage("errorquantityzero", null, locale));
			}
			else
			{
				model.addAttribute("wrongquantity", messageSource.getMessage("erroroverflowquantity", null, locale));
			}
			return "integrated:product";
		}

		
		CartForm cart = (CartForm)request.getSession().getAttribute("currentCart");
		int keyNewProduct = cart.countCartElement()+1;
		
		boolean isOk = cart.addProduct(keyNewProduct, ProdChosen);
		
		if(isOk)
		{
			model.addAttribute("categoryForm", new CategoryForm());
			model.addAttribute("categories", categoryDAO.getCategory(locale.toString()));
			return "integrated:searchProduct";
		}
		else
		{
			model.addAttribute("wrongquantity", messageSource.getMessage("productAlreadyExist", null, locale));
			return "integrated:product";
		}
	}

}
