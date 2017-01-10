package com.spring.henallux.model;

public class Cart
{

	private Integer idcart;
	private java.util.Date orderdate;
	private String idperson;
	
	public Cart(){}
	public Cart(Integer idC, java.util.Date orderD, String idPers)
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
