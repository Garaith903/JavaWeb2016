package com.spring.henallux.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.spring.henallux.model.TranslationCategory;

@Service
public class CategoryService {

private ArrayList<TranslationCategory> listCategories;
	
	public CategoryService()
	{
		listCategories = new ArrayList<TranslationCategory>();
		listCategories.add(new TranslationCategory(1,"Toutes", "fra", "all"));
		listCategories.add(new TranslationCategory(2,"Basique", "fra","cbasique"));
		listCategories.add(new TranslationCategory(3,"Amelioree", "fra","ameliore"));
		listCategories.add(new TranslationCategory(4,"Internet", "fra","internet"));
		listCategories.add(new TranslationCategory(5,"Portable", "fra", "portable"));
		
	}
	
	public ArrayList<TranslationCategory> getCategories()
	{
		return listCategories;
	}
	
	public void setHobbies(ArrayList<TranslationCategory> newListCategories)
	{
		listCategories = newListCategories;
	}
}
