package com.spring.henallux.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Picture {

	private String idpic;
	private String namepic;
	private String urlpic;
	private String idprod;
	
	
	//CONSTRUCTOR
	public Picture()
	{
		
	}
	
	public Picture(String id, String name, String url, String idPr)
	{
		idpic = id;
		namepic = name;
		urlpic = url;
		idprod = idPr;
	}
	
	//SETTORS
	public void setIdpic(String idP)
	{
		idpic = idP;
	}
	public void setNamepic(String nameP)
	{
		namepic = nameP;
	}
	public void setUrlpic(String url)
	{
		urlpic = url;
	}
	public void setIdprodc(String idPro)
	{
		idprod = idPro;
	}
	
	//GETTORS
	public String getIdpic()
	{
		return idpic;
	}
	public String getNamepic()
	{
		return namepic;
	}
	public String getUrlpic()
	{
		return urlpic;
	}
	public String getIdprodc()
	{
		return idprod;
	}

}
