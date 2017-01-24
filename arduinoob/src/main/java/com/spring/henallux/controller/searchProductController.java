package com.spring.henallux.controller;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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

import com.spring.henallux.dataAccess.dao.TranslationCategoryDAO;
import com.spring.henallux.dataAccess.dao.TranslationProductDAO;
import com.spring.henallux.dataAccess.dao.DisplayedProductDAO;
import com.spring.henallux.dataAccess.dao.PictureDAO;
import com.spring.henallux.dataAccess.dao.ProductDAO;
import com.spring.henallux.model.CartForm;
import com.spring.henallux.model.CategoryForm;
import com.spring.henallux.model.DisplayedProduct;
import com.spring.henallux.model.Picture;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.ProductCart;
import com.spring.henallux.model.TranslationCategory;
import com.spring.henallux.service.CategoryService;

@Controller
@RequestMapping(value="/searchproduct")
@SessionAttributes({SearchProductController.SELECTEDPRODUCTTOADD})
public class SearchProductController {
	
	@Autowired
	private TranslationCategoryDAO categoryDAO;
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private PictureDAO pictureDAO;
	@Autowired
	private DisplayedProductDAO displayedProductDAO;
	@Autowired
	private TranslationProductDAO translationProductDAO;
	
	protected static final String SELECTEDPRODUCTTOADD = "selectedProductToAdd";
	@ModelAttribute(SELECTEDPRODUCTTOADD)
	public ProductCart productCart()
	{
		return new ProductCart();
	}
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, Locale locale)
	{
		model.addAttribute("categoryForm", new CategoryForm());
		model.addAttribute("categories", categoryDAO.getCategory(locale.toString()));
		
		return "integrated:searchProduct";
	}
	
	@RequestMapping(value="/sendCategory",method=RequestMethod.POST)
	public String getProductFormData(Model model, @ModelAttribute(value="categoryForm") CategoryForm choiceCategory, Locale locale)
	{
		String idCategory = "all";
		ArrayList<TranslationCategory> categ = categoryDAO.getCategory(locale.toString());
		for(TranslationCategory ca : categ)
		{
			if(ca.getTranslationName().equals(choiceCategory.getLabelCategory()))
			{
				idCategory = ca.getIdCategory();
			}
		}
		
		model.addAttribute("categoryForm", new CategoryForm());
		model.addAttribute("categories", categoryDAO.getCategory(locale.toString()));
		
		model.addAttribute("listProducts", displayedProductDAO.getDisplayedProducts(productDAO.getProductsByCategory(idCategory), pictureDAO.getAllNamePicture(productDAO.getProductsByCategory(idCategory)), translationProductDAO.getTranslationProducts(productDAO.getProductsByCategory(idCategory), locale.toString())));

		return "integrated:/searchProduct";
	}
	
	@RequestMapping(value="/selectedProduct")
	public String selectedProductHandler(HttpServletRequest request, Model model, @ModelAttribute(value="selectedProductToAdd") ProductCart productToAddToCart, @RequestParam(value = "idselectedproduct", defaultValue = "") String idProductToBuy)
	{
		Product product = null;
		Picture picture = null;

        if (idProductToBuy != null && idProductToBuy.length() > 0) 
        {
            product = productDAO.getOneProductById(idProductToBuy);
            picture = pictureDAO.getPictureById(idProductToBuy);
            productToAddToCart.setProduct(product);
            productToAddToCart.setNamePicture(picture.getNamepic());
            productToAddToCart.setQuantity(0);

            
            return "redirect:/product";
        }
        
        return "integrated:searchProduct";
	}

}
