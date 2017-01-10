package com.spring.henallux.model;


public class LineProduct {
	
	private Integer idlineproduct;
	private Integer quantity;
	private double discount;
	private Integer idcartperson;
	private String idproduct;
	
	public LineProduct(){}
	public LineProduct(Integer idLP, Integer qty, double disc, Integer idCart, String idProd)
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
