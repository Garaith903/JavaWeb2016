package com.spring.henallux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.dataAccess.dao.CategoryDAO;
import com.spring.henallux.model.categoryForm;
import com.spring.henallux.service.CategoryService;

@Controller
@RequestMapping(value="/searchproduct")
public class SearchProductController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	//private CategoryService categoryService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("categoryForm", new categoryForm());
		model.addAttribute("categories", categoryDAO.getCategory());
		
		return "integrated:searchProduct";
	}
	
	@RequestMapping(value="/sendCategory",method=RequestMethod.POST)
	public String getProductFormData(Model model, @ModelAttribute(value="categoryForm") categoryForm choiceCategory)
	{
		
		return "redirect:/searchproduct";
	}

}
