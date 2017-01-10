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
        	total += cart.get(keyIn).getTotalOfProduct();		
        }
        return total;
    }
	
	public void updateQuantity(CartForm cartFormulaire) 
	{
        if (cartFormulaire != null)
        {
        	Iterator<Integer> keySetIterator = cartFormulaire.getCart().keySet().iterator();
             
            while(keySetIterator.hasNext())
            {	
            	Integer keyInFormulaire = keySetIterator.next();
            	this.updateProduct(cartFormulaire.getCart().get(keyInFormulaire), keyInFormulaire);	
            }
        }
    }
	
	public void updateProduct(ProductCart prodCartFormulaire, Integer keyProdFormulaire)
	{
		ProductCart productCartGeneralToUpdate = this.findProductById(prodCartFormulaire.getProduct().getIdproduct());
		Integer integerKeyCartGeneralToUpdate = this.findKeyProductCartById(prodCartFormulaire.getProduct().getIdproduct());
 
        if (productCartGeneralToUpdate != null) 
        {
            if (prodCartFormulaire.getQuantity() <= 0 || prodCartFormulaire.getQuantity() > productCartGeneralToUpdate.getQuantity())
            {
                this.cart.remove(integerKeyCartGeneralToUpdate);
            } 
            else 
            {
            	productCartGeneralToUpdate.setQuantity(prodCartFormulaire.getQuantity());
            }
        }
    }
	
	public ProductCart findProductById(String idProd)
	{
		Iterator<Integer> keySetIterator = this.cart.keySet().iterator(); 
        
        while(keySetIterator.hasNext())
        { 
        	Integer keyIn = keySetIterator.next();
        	
        	if(this.cart.get(keyIn).getProduct().getIdproduct().equals(idProd))
        	{
        		return this.cart.get(keyIn);
        	}
        }
		return null;
    }
	
	public Integer findKeyProductCartById(String idProd)
	{
		Iterator<Integer> keySetIterator = this.cart.keySet().iterator(); 
        
        while(keySetIterator.hasNext())
        { 
        	Integer keyIn = keySetIterator.next();
        	
        	if(this.cart.get(keyIn).getProduct().getIdproduct().equals(idProd))
        	{
        		return keyIn;
        	}
        }
		return null;
    }

}
