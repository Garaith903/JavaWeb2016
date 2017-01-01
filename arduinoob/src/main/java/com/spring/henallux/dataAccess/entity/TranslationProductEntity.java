package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Translationproduct")
public class TranslationProductEntity 
{
	@Id
	@Column(name="idtranslationproduct")
	private Integer idtranslationproduct;
	
	@Column(name="idlang")
	private String idlang;
	
	@Column(name="idprod")
	private String idprod;
	
	@Column(name="translationname")
	private String translationname;
	
	@Column(name="translationdescription")
	private String translationdescription;
	
	//CONSTRUCTORS
	public TranslationProductEntity(){}
	
	public TranslationProductEntity(Integer id, String idL, String idP, String translationN, String translationD)
	{
		idtranslationproduct = id;
		idlang = idL;
		idprod = idP;
		translationname = translationN;
		translationdescription = translationD;
	}
	
	//SETTORS
	public void setIdtranslationproduct(Integer id)
	{
		idtranslationproduct = id;
	}
	public void setIdlang(String idL)
	{
		idlang = idL;
	}
	public void setIdprod(String idP)
	{
		idprod = idP;
	}
	public void setTranslationname(String translationNa)
	{
		translationname = translationNa;
	}
	public void setTranslationdescription(String translationdescript)
	{
		translationdescription = translationdescript;
	}
	
	//GETTORS
	public Integer getIdtranslationproduct()
	{
		return idtranslationproduct;
	}
	public String getIdlang()
	{
		return idlang;
	}
	public String getIdprod()
	{
		return idprod;
	}
	public String getTranslationname()
	{
		return translationname;
	}
	public String getTranslationdescription()
	{
		return translationdescription;
	}

}

