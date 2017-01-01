package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/demonstration")
public class DemonstrationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String demo(Model model)
	{
		return "integrated:demonstration";
	}

}
