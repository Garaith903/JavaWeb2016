package com.spring.henallux.model;

public class ProductCart {
	
	private Product product;
	private int quantity;
	private String namePicture;
	
	public ProductCart (){}
	public ProductCart (Product prod, int qty, String namePic)
	{
		product = prod;
		quantity = qty;
		namePicture = namePic;
	}
	
	public void setProduct(Product productIn)
	{
		product = productIn;
	}
	public void setQuantity(int qtyIn)
	{
		quantity = qtyIn;
	}
	public void setNamePic(String namePictureIn)
	{
		namePicture = namePictureIn;
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
	public double getAmount() {
        return this.product.getPriceu() * this.quantity;
    }
}
