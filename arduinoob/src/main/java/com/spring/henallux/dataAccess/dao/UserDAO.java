package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.UserInscriptionFormEntity;
import com.spring.henallux.dataAccess.repository.UserInscriptionRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.LoginForm;

@Service
public class UserDAO {
	
	@Autowired
	private UserInscriptionRepository userInscriptionRepository;
	
	@Autowired
	private ProviderConverter providerConverter;

	public Boolean connexion(LoginForm user)
	{
		Boolean isOk;
		
		UserInscriptionFormEntity userDb = userInscriptionRepository.findOne(user.getPseudo());
		if(userDb != null && userDb.getPassword().equals(user.getPassword()))
		{
			isOk = true;
				
		}else
		{
			isOk = false;
		}
			
		return isOk;
	}
}