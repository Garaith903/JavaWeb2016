package com.spring.henallux.model;

import java.util.HashMap;
import java.util.Iterator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CartForm 
{
	private HashMap<Integer, ProductCart> cart;
	private String userId;
	
	public CartForm(){
		cart = new HashMap<Integer, ProductCart>(); 
	}
	public CartForm(String id, HashMap<Integer, ProductCart> cartIn)
	{
		userId = id;
		cart = cartIn;
	}
	
	public void setUserId(String idIn)
	{
		userId = idIn;
	}
	public void setCart(HashMap<Integer, ProductCart> crt)
	{
		cart = crt;
	}
	
	public String getUserId()
	{
		return userId;
	}
	public HashMap<Integer, ProductCart> getCart()
	{
		return cart;
	}
	
	public ProductCart getProduct(int key)
	{
		return cart.get(key);
	}
	
	public Boolean addProduct(int key, ProductCart p)
	{
		if(cart.containsKey(key))
		{
			return false;
		}
		else
		{
			cart.put(key, p);
			return true;
		}
	}
	
	public void replaceProduct(int key, ProductCart p)
	{
		cart.replace(key, p);
	}
	
	public double getAmountTotal()
	{
        double total = 0;
        
        Iterator<Integer> keySetIterator = cart.keySet().iterator(); 
        
        while(keySetIterator.hasNext())
        { 
        	Integer keyIn = keySetIterator.next();
        	total += cart.get(keyIn).getAmount();		
        }
        return total;
    }

}
