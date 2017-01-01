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
import com.spring.henallux.model.Nationality;
import com.spring.henallux.model.UserInscriptionForm;
import com.spring.henallux.service.NationalityService;
import com.spring.henallux.service.PasswordEncryption;

@Controller
@RequestMapping(value="/inscription")
@SessionAttributes({UserInscriptionController.CURRENTUSER})
public class UserInscriptionController 
{
	protected static final String CURRENTUSER = "currentUser";
	
	@ModelAttribute(CURRENTUSER)
	public UserInscriptionForm user()
	{
		return new UserInscriptionForm();
	}
	
	@Autowired
	private NationalityDAO nationalityDAO;
	//private NationalityService nationalityService;
	@Autowired
	private UserInscriptionFormDAO userInscriptionFormDAO;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private PasswordEncryption passwordEncryption;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home( Model model)
	{
		model.addAttribute("currentUser", new UserInscriptionForm());
		model.addAttribute("listcountries",nationalityDAO.getNationalities());
	
		
		return "integrated:userInscription";
	}
	
	@RequestMapping(value="/sendInscription", method=RequestMethod.POST)
	public String getInscriptionFormData(Model model, @Valid @ModelAttribute(value="CURRENTUSER") UserInscriptionForm currentUser, final BindingResult errors, Locale locale)
	{
		//<form:input type="date" path="birthdate"/>
		String inscriptionMessage;
		
		String passwordToCompare = currentUser.getPassword();
		String errorPassword;
		String errorEmail;
		String acceptedEmail = "^[a-z0-9._-]+@([a-z0-9._-]+)\\.[a-z]{2,6}$";
		
		if(!passwordToCompare.equals(currentUser.getPasswordCheck()))
		{
			errorPassword = "Le mot de passe de verification doit etre identique au mot de passe";
			model.addAttribute("wrongcheckpassword", errorPassword);
			return "integrated:/inscription";
		}
		if(!currentUser.getEmail().matches(acceptedEmail))
		{
			errorEmail = "Le format de l'adresse email est invalide";
			model.addAttribute("wrongemail", errorEmail);
			return "integrated:/inscription";
		}
		
		
		if(!errors.hasErrors())
		{
			String encryptedPassword;
			
			try
			{
				encryptedPassword = passwordEncryption.cryptPwd(currentUser.getPassword());
				currentUser.setPassword(encryptedPassword);
				
				inscriptionMessage = "Inscription reussie";
				model.addAttribute("inscriptionInfo", inscriptionMessage);
				
				model.addAttribute("pseudo", currentUser);
				model.addAttribute("password", currentUser);
				model.addAttribute("firstName", currentUser);
				model.addAttribute("lastName", currentUser);
				model.addAttribute("address", currentUser);
				model.addAttribute("birthdate", currentUser);
				model.addAttribute("sex", currentUser);
				model.addAttribute("count", currentUser);
				model.addAttribute("email", currentUser);
				model.addAttribute("mobileNumber", currentUser);

				userInscriptionFormDAO.saveUser(currentUser);
				return "integrated:home";

			}
			catch(NoSuchAlgorithmException e)
			{
				e.printStackTrace();
			}
			
		} else {
			inscriptionMessage = "Echec de l'inscription";
			model.addAttribute("inscriptionInfo", inscriptionMessage);
			
			return "integrated:/inscription";
		}
		return "integrated:/inscription";
	}

}