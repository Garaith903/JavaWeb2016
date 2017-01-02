package com.spring.henallux.model;

public class DisplayedProduct 
{
	private String idProduct;
	private String nameProduct;
	private String namePic;
	private double priceProd;
	
	public DisplayedProduct()
	{
	}
	public DisplayedProduct(String idProd, String nameProd, String nameP, double pr)
	{
		idProduct = idProd; 
		nameProduct = nameProd;
		namePic = nameP;
		priceProd = pr;
	}
	
	//SETTORS
	public void setIdProduct(String idPr)
	{
		idProduct = idPr;
	}
	public void setNameProduct(String n)
	{
		nameProduct = n;
	}
	public void setIdPic(String namePi)
	{
		namePic = namePi;
	}
	public void setIdProd(double pr)
	{
		priceProd = pr;
	}
	
	//GETTORS
	public String getIdProduct()
	{
		return idProduct;
	}
	public String getNameProduct()
	{
		return nameProduct;
	}
	public String getNamePic()
	{
		return namePic;
	}
	public double getPriceProd()
	{
		return priceProd;
	}



}
