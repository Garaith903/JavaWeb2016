package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.NationalityEntity;
import com.spring.henallux.dataAccess.repository.NationalityRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Nationality;

@Service
@Transactional
public class NationalityDAO {

	@Autowired
	private NationalityRepository nationalityRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	
	public ArrayList<Nationality> getNationalities()
	{
		List<NationalityEntity> nationalityEntities = nationalityRepository.findAll();
		ArrayList<Nationality> nationalities = new ArrayList<Nationality>();
		for (NationalityEntity nE : nationalityEntities)
		{

			Nationality nationality;
			nationality = providerConverter.ConvertNationalityEntityToNationalityModel(nE);
			nationalities.add(nationality);
		}
		return nationalities;
	}
}
