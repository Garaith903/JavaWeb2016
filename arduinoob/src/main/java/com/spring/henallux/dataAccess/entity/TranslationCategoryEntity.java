package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Translationcategory")
public class TranslationCategoryEntity {
	
	@Id
	@Column(name="idtranslationcategory")
	private Integer idTranslationCategory;
	
	@Column(name="translationnamecategory")
	private String translation;
	
	@Column(name="idlang")
	private String idLang;
	
	@Column(name="idcateg")
	private String idCateg;
	
	public TranslationCategoryEntity()
	{
		
	}
	
	public void setId(Integer id)
	{
		idTranslationCategory = id;
	}
	public void setTranslation(String tr)
	{
		translation = tr;
	}
	public void setIdLang(String idL)
	{
		idLang = idL;
	}
	public void setIdCateg(String idC)
	{
		idCateg = idC;	
	}
	
	public Integer getId()
	{
		return idTranslationCategory;
	}
	public String getTranslation()
	{
		return translation;
	}
	public String getIdLang()
	{
		return idLang;
	}
	public String getIdCateg()
	{
		return idCateg;	
	}

}
