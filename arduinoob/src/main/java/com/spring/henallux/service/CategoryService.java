package com.spring.henallux.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.spring.henallux.model.Category;

@Service
public class CategoryService {

private ArrayList<Category> listCategories;
	
	public CategoryService()
	{
		listCategories = new ArrayList<Category>();
		listCategories.add(new Category(1,"Toutes", "fra", "all"));
		listCategories.add(new Category(2,"Basique", "fra","cbasique"));
		listCategories.add(new Category(3,"Amelioree", "fra","ameliore"));
		listCategories.add(new Category(4,"Internet", "fra","internet"));
		listCategories.add(new Category(5,"Portable", "fra", "portable"));
		
	}
	
	public ArrayList<Category> getCategories()
	{
		return listCategories;
	}
	
	public void setHobbies(ArrayList<Category> newListCategories)
	{
		listCategories = newListCategories;
	}
}
