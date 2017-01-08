package com.spring.henallux.controller;

import java.security.NoSuchAlgorithmException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.jni.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.NationalityDAO;
import com.spring.henallux.dataAccess.dao.UserDAO;
import com.spring.henallux.model.CartForm;
import com.spring.henallux.model.LoginForm;
import com.spring.henallux.model.UserInscriptionForm;
import com.spring.henallux.service.PasswordEncryption;

@Controller
@RequestMapping(value="/login")
@SessionAttributes({"currentUser"})
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private PasswordEncryption passwordEncryption;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, @ModelAttribute(value="currentUser")LoginForm currentUser, Locale locale)
	{
		model.addAttribute("loginForm", new LoginForm());
		logger.info("CurrnetUser "+currentUser);
		String pseudo = currentUser.getPseudo();
		
		if(pseudo != null)
		{
			model.addAttribute("allreadyloggedin", messageSource.getMessage("allreadylogged", null, locale));
			return "integrated:errorLogin";
		}
		else
		{
			return "integrated:login";
		}
	}
	
	@RequestMapping(value="/confirminscription", method=RequestMethod.GET)
	public String home(Model model,  @ModelAttribute(value="pseudo")String pseudoUser, Locale locale)
	{
		LoginForm loginForm =  new LoginForm();
		loginForm.setPseudo(pseudoUser);
		
		model.addAttribute("loginForm", loginForm);
		return "integrated:login";
	}
	
	@RequestMapping(value="/sendlogin", method=RequestMethod.POST)
	public String getLoginFormData(Model model, @Valid @ModelAttribute(value="CURRENTUSER")LoginForm currentUser, final BindingResult errors, Locale locale)
	{
		if(!errors.hasErrors())	
		{	
			try{
				
				String encryptedPassword = passwordEncryption.cryptPwd(currentUser.getPassword());
				currentUser.setPassword(encryptedPassword);
				Boolean isOk = userDAO.connexion(currentUser);
				
				if (isOk)
				{
					model.addAttribute("currentUser",currentUser);
					model.addAttribute("pseudouser",currentUser.getPseudo());
					return "integrated:home";
				}
				else
				{
					model.addAttribute("errorloginorpassword", messageSource.getMessage("wrongloginorpassword", null, locale));
					return "integrated:errorLogin";
				}
				
			}
			catch(NoSuchAlgorithmException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			return "integrated:errorLogin";
		}
		return "integrated:errorLogin";
	}
	
	@RequestMapping(value="/disconnect")
	public String disconnectUser(Model model, @ModelAttribute(value="CURRENTUSER")LoginForm currentUser, HttpServletRequest request, Locale locale)
	{
		currentUser = new LoginForm();
		CartForm cart = (CartForm)request.getSession().getAttribute("currentCart");
		 cart = new CartForm();
		
		
		model.addAttribute("currentUser",currentUser);
		model.addAttribute("pseudouser",currentUser.getPseudo());

		
		return "integrated:home";
		
	}

}