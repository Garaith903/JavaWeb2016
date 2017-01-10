package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lineproduct")
public class LineProductEntity {

	@Id
	@Column(name="idlineproduct")
	private Integer idlineproduct;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="discount")
	private double discount;
	
	@Column(name="idcartperson")
	private Integer idcartperson;
	
	@Column(name="idproduct")
	private String idproduct;
	
	public LineProductEntity(){}
	public LineProductEntity(Integer idLP, Integer qty, double disc, Integer idCart, String idProd)
	{
		idlineproduct = idLP;
		quantity = qty;
		discount = disc;
		idcartperson = idCart;
		idproduct = idProd;
	}
	
	//SETTORS
	public void setIdlineproduct(Integer idLineProductIn)
	{
		idlineproduct = idLineProductIn;
	}
	public void setQuantity(Integer quantityIn)
	{
		quantity = quantityIn;
	}
	public void setDiscount(double discountIn)
	{
		discount = discountIn;
	}
	public void setIdcartperson(Integer idcartpersonIn)
	{
		idcartperson = idcartpersonIn;
	}
	public void setIdproduct(String idproductIn)
	{
		idproduct = idproductIn;
	}
	//GETTORS
	public Integer getIdlineproduct()
	{
		return idlineproduct;
	}
	public Integer getQuantity()
	{
		return quantity;
	}
	public double getDiscount()
	{
		return discount;
	}
	public Integer getIdcartperson()
	{
		return idcartperson;
	}
	public String getIdproduct()
	{
		return idproduct;
	}
}
