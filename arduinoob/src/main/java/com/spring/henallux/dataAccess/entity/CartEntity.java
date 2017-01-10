package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class CartEntity {
	
	@Id
	@Column(name="idcart")
	private Integer idcart;
	
	@Column(name="orderdate")
	private java.util.Date orderdate;
	
	@Column(name="idperson")
	private String idperson;
	
	public CartEntity(){}
	public CartEntity(Integer idC, java.util.Date orderD, String idPers)
	{
		idcart = idC;
		orderdate = orderD;
		idperson = idPers;
	}
	
	public void setIdcart(Integer idCartIn)
	{
		idcart = idCartIn;
	}
	public void setOrderdate(java.util.Date orderDateIn)
	{
		orderdate = orderDateIn;
	}
	public void setIdperson(String idPersonIn)
	{
		idperson = idPersonIn;
	}
	
	public Integer getIdcart()
	{
		return idcart;
	}
	public java.util.Date getOrderdate()
	{
		return orderdate;
	}
	public String getIdperson()
	{
		return idperson;
	}


}
