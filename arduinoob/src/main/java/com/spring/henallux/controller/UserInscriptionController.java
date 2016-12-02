package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.henallux.model.UserInscriptionForm;

@Controller
@RequestMapping(value="/inscription")
public class UserInscriptionController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("inscriptionForm", new UserInscriptionForm());
		return "integrated:userInscription";
	}
	
	@RequestMapping(value="/sendInscription", method=RequestMethod.POST)
	public String getInscriptionFormData(Model model, @ModelAttribute(value="inscriptionForm") UserInscriptionForm form)
	{
		return "integrated:userInscription";
	}

}