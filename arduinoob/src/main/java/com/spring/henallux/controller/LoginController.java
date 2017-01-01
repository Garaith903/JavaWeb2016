package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.LoginForm;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("loginForm", new LoginForm());
		return "integrated:login";
	}
	
	@RequestMapping(value="/sendlogin", method=RequestMethod.POST)
	public String getLoginFormData(Model model, @ModelAttribute(value="loginForm") LoginForm form)
	{
		LoginForm test = new LoginForm("garaith", "mdp"); 
		if ( (form.getPseudo().equals(test.getPseudo())) && (form.getPassword().equals(test.getPassword())) )
		{
			return "integrated:home";
		}
		else
		{
			return "integrated:errorLogin";
		}
	}

}
