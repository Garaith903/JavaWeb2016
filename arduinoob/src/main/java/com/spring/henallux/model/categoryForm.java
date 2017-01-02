package com.spring.henallux.model;

public class CategoryForm {
	
	private String labelCategory;
	private String idCategory;
	
	public CategoryForm(){}
	
	public void setLabelCategory(String lC)
	{
		labelCategory = lC;
	}
	public void setIdCategory(String idC)
	{
		idCategory = idC;
	}
	public String getLabelCategory()
	{
		return labelCategory;
	}
	public String getIdCategory()
	{
		return idCategory;
	}

}
