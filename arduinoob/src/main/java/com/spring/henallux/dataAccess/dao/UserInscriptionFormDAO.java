package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.UserInscriptionFormEntity;
import com.spring.henallux.dataAccess.repository.UserInscriptionRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.UserInscriptionForm;

@Service
public class UserInscriptionFormDAO{

	@Autowired
	private UserInscriptionRepository userInscriptionFormRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public UserInscriptionForm saveUser(UserInscriptionForm user)
	{
		UserInscriptionFormEntity userEntity;
		
		userEntity = providerConverter.ConvertUserModelToUserEntity(user);
		
		userInscriptionFormRepository.save(userEntity);
		
		return providerConverter.ConvertUserEntityToUserModel(userEntity);
	}
	
	public Boolean findOneById(UserInscriptionForm user)
	{
		UserInscriptionFormEntity userFound = null;
		userFound = providerConverter.ConvertUserModelToUserEntity(user);
		
		userFound = userInscriptionFormRepository.findOne(user.getPseudo());
		
		if(userFound == null)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public Boolean findPseudo(String user)
	{
		return userInscriptionFormRepository.exists(user);	
	}
}
