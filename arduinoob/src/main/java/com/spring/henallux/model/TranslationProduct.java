package com.spring.henallux.model;

public class TranslationProduct {
	
	private int idtranslationproduct;
	private String idlang;
	private String idprod;
	private String translationname;
	private String translationdescription;
	
	//CONSTRUCTORS
	public TranslationProduct(){}
	public TranslationProduct(int id, String idL, String idP, String translationN, String translationD)
	{
		idtranslationproduct = id;
		idlang = idL;
		idprod = idP;
		translationname = translationN;
		translationdescription = translationD;
	}
	
	//SETTORS
	public void setIdtranslationproduct(int id)
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
	public int getIdtranslationproduct()
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
