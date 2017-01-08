package com.spring.henallux.controller;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.NationalityDAO;
import com.spring.henallux.dataAccess.dao.UserInscriptionFormDAO;
import com.spring.henallux.model.LoginForm;
import com.spring.henallux.model.Nationality;
import com.spring.henallux.model.UserInscriptionForm;
import com.spring.henallux.service.NationalityService;
import com.spring.henallux.service.PasswordEncryption;

@Controller
@RequestMapping(value="/inscription")
public class UserInscriptionController 
{	
	@Autowired
	private NationalityDAO nationalityDAO;
	@Autowired
	private UserInscriptionFormDAO userInscriptionFormDAO;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private PasswordEncryption passwordEncryption;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, Locale locale)
	{
		model.addAttribute("inscriptionUser", new UserInscriptionForm());
		model.addAttribute("listcountries",nationalityDAO.getNationalities(locale.toString()));
	
		return "integrated:userInscription";
	}
	
	@RequestMapping(value="/sendInscription", method=RequestMethod.POST)
	public String getInscriptionFormData(Model model, @Valid@ModelAttribute(value="inscriptionUser") UserInscriptionForm inscriptionUser, final BindingResult errors, Locale locale)
	{	
		String passwordToCompare = inscriptionUser.getPassword();
		String acceptedEmail = "^[a-z0-9._-]+@([a-z0-9._-]+)\\.[a-z]{2,6}$";
		
		model.addAttribute("currentUser", inscriptionUser);
		model.addAttribute("listcountries",nationalityDAO.getNationalities(locale.toString()));
			
		if(userInscriptionFormDAO.findPseudo(inscriptionUser.getPseudo()))
		{
			model.addAttribute("wrongpseudo", messageSource.getMessage("errorpseudo", null, locale));
			return "integrated:/userInscription";
		}
		
		if(!passwordToCompare.equals(inscriptionUser.getPasswordCheck()))
		{
			model.addAttribute("wrongcheckpassword", messageSource.getMessage("errorpassword", null, locale));
			return "integrated:/userInscription";
		}
		if(!inscriptionUser.getEmail().matches(acceptedEmail))
		{
			model.addAttribute("wrongemail", messageSource.getMessage("erroremail", null, locale));
			return "integrated:/userInscription";
		}
		
		
		if(!errors.hasErrors())
		{
			String encryptedPassword;
			
			try
			{
				encryptedPassword = passwordEncryption.cryptPwd(inscriptionUser.getPassword());
				inscriptionUser.setPassword(encryptedPassword);
								
				model.addAttribute("justregistered", "Veuillez confirmer votre inscription");
				userInscriptionFormDAO.saveUser(inscriptionUser);

				model.addAttribute("pseudo",inscriptionUser.getPseudo());
				return "redirect:/login/confirminscription";

			}
			catch(NoSuchAlgorithmException e)
			{
				e.printStackTrace();
			}
			
		} else 
		{
			model.addAttribute("inscriptionInfo", messageSource.getMessage("inscriptionInfoError", null, locale));
			
			return "integrated:/userInscription";
		}
		return "integrated:/userInscription";
	}

}