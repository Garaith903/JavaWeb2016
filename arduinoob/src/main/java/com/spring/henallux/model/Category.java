package com.spring.henallux.model;

public class Category {
	
	private int idTranslationCategory;
	private String translationName;
	private String idLang;
	private String idCategory;
	
	public Category(){}
	public Category(int idTr, String translation, String idL, String idC)
	{ 
		idTranslationCategory = idTr;
		translationName = translation;
		idLang = idL;
		idCategory = idC;
	}
	
	public void setIdTranslationCategory(int id){ idTranslationCategory = id; }
	public void setTranslationName(String name){ translationName = name; }
	public void setIdLang(String idL){ idLang = idL; }
	public void setIdCategory(String idC){ idCategory = idC; }
	
	public int getIdTranslationCategory(){ return idTranslationCategory; }
	public String getTranslationName(){ return translationName; }
	public String getIdLang(){ return idLang; }
	public String getIdCategory(){ return idCategory; }

}
