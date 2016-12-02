package com.spring.henallux.model;

public class Category {
	
	private String idCategory;
	private String nameCategory;
	
	public Category(){}
	public Category(String idC, String nameC)
	{ 
		idCategory = idC;
		nameCategory = nameC;
	}
	
	public void setIdCategory(String id){ idCategory = id; }
	public void setNameCategory(String name){ nameCategory = name; }
	public String getIdCategory(){ return idCategory; }
	public String getNameCategory(){ return nameCategory; }

}
