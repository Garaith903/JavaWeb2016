package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Picture")
public class PictureEntity 
{
	@Id
	@Column(name="idpic")
	private String idpic;
	
	@Column(name="namepic")
	private String namepic;
	
	@Column(name="urlpic")
	private String urlpic;
	
	@Column(name="idprod")
	private String idprod;
	
	
	//CONSTRUCTOR
	public PictureEntity()
	{
		
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
