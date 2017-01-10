package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Promotion")
public class PromotionEntity 
{
	@Id
	@Column(name="idpromweek")
	private String idpromweek;
	
	@Column(name="promotionofweek")
	private double promotionofweek;
	
	@Column(name="idcategprod")
	private String idcategprod;
	
	public PromotionEntity(){}
	
	public PromotionEntity(String idPromo, double promo, String idCateg)
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
