package com.spring.henallux.dataAccess.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.TranslationCategoryEntity;
import com.spring.henallux.dataAccess.repository.CategoryRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.TranslationCategory;


@Service
@Transactional
public class TranslationCategoryDAO {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public ArrayList<TranslationCategory> getCategory(String lang)
	{
		String filterLng = (lang.equals("en"))?"eng":"fra";

		List<TranslationCategoryEntity> categoryEntities = categoryRepository.findAll();
		ArrayList<TranslationCategory> listCategory = new ArrayList<TranslationCategory>();
		
		TranslationCategory catAll;
		if(filterLng.equals("fra"))
		{
			catAll = new TranslationCategory(0, "Toutes les catégories", "fra", "all");
		}
		else
		{
			catAll = new TranslationCategory(0, "All categories", "eng", "all");
		}
		listCategory.add(catAll);
		
		for(TranslationCategoryEntity categEnt : categoryEntities)
		{
			TranslationCategory cat = new TranslationCategory();
			cat = providerConverter.ConvertCategoryEntityToCategoryModel(categEnt);
			
			if(cat.getIdLang().equals(filterLng))
			{
				listCategory.add(cat);
			}
		}
		return listCategory;
	}
	
	public String getNameOfOneCategory(String idCat, String lng)
	{
		ArrayList<TranslationCategory> translations = getCategory(lng);
		String name = null;
		for(TranslationCategory tr :translations)
		{
			if(tr.getIdCategory().equals(idCat))
			{
				name = tr.getTranslationName();
			}
		}
		return name;
	}
}
