package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.model.CartForm;
import com.spring.henallux.model.LoginForm;

@Controller
@RequestMapping(value="/home")
@SessionAttributes({HomeController.CURRENTUSER, HomeController.CURRENTCART})
public class HomeController {

	protected static final String CURRENTUSER = "currentUser";
	protected static final String CURRENTCART = "currentCart";
	
	@ModelAttribute(CURRENTUSER)
	public LoginForm user()
	{
		return new LoginForm();
	}
	
	@ModelAttribute(CURRENTCART)
	public CartForm cart()
	{
		return new  CartForm();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model,@ModelAttribute(value=CURRENTCART)CartForm currentUsercart, @ModelAttribute(value=CURRENTUSER)LoginForm currentUser)
	{
		model.addAttribute("pseudouser", currentUser.getPseudo());
		return "integrated:home";
	}
	
	
	
}
