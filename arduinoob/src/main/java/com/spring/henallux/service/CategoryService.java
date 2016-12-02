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
		listCategories.add(new Category("1", "Toutes"));
		listCategories.add(new Category("2", "Basique"));
		listCategories.add(new Category("3", "Amelioree"));
		listCategories.add(new Category("4", "Internet"));
		listCategories.add(new Category("5", "Portable"));
		
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
