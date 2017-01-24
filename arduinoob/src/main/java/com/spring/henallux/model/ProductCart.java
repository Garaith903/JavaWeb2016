package com.spring.henallux.model;

import javax.validation.constraints.Min;

public class ProductCart {
	
	private Product product;
	private int quantity;
	private String namePicture;
	private double discount;
	
	public ProductCart (){}
	public ProductCart (Product prod, int qty, String namePic)
	{
		product = prod;
		quantity = qty;
		namePicture = namePic;
		discount = 0;
	}
	
	public void setProduct(Product productIn)
	{
		product = productIn;
	}
	public void setQuantity(int qtyIn)
	{
		quantity = qtyIn;
	}
	public void setNamePicture(String namePictureIn)
	{
		namePicture = namePictureIn;
	}
	public void setDiscount(double disc)
	{
		discount = disc;
	}
	
	
	public Product getProduct()
	{
		return product;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public String getNamePicture()
	{
		return namePicture;
	}
	public double getDiscount()
	{
		return discount;
	}
	
	public double getAmount() {
        return this.product.getPriceu() * this.quantity;
    }
	
	public double getAmountWithDiscount() 
	{
		if(discount == 0)
		{
			return  0;
		}
		else
		{
			return  getAmount()*discount;
		}
    }
	
	public double getTotalOfProduct() 
	{
		return (getAmount()-getAmountWithDiscount());
    }
}
