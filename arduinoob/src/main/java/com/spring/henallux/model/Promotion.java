package com.spring.henallux.model;

public class Promotion 
{
	private String idpromweek;
	private double promotionofweek;
	private String idcategprod;
	
	public Promotion(){}
	public Promotion(String idPromo, double promo, String idCateg)
	{
		idpromweek = idPromo;
		promotionofweek = promo;
		idcategprod = idCateg;
	}
	
	public void setIdpromweek(String idPromo)
	{
		idpromweek = idPromo;
	}
	public void setPromotionofweek(double promo)
	{
		promotionofweek = promo;
	}
	public void setIdcategprod(String idcateg)
	{
		idcategprod = idcateg;
	}
	
	public String getIdpromweek()
	{
		return idpromweek;
	}
	public double getPromotionofweek()
	{
		return promotionofweek;
	}
	public String getIdcategprod()
	{
		return idcategprod;
	}

}
