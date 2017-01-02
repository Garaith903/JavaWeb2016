package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.NationalityEntity;
import com.spring.henallux.model.DisplayedProduct;
import com.spring.henallux.model.Nationality;
import com.spring.henallux.model.Product;


@Service
public class DisplayedProductDAO 
{

	public ArrayList<DisplayedProduct> getDisplayedProducts(ArrayList<Product> products, ArrayList<String> namePictures, ArrayList<String> nameProducts)
	{
		ArrayList<DisplayedProduct> displayedProducts = new ArrayList<DisplayedProduct>();
		
		for(int i = 0; i < products.size(); i++)
		{
			DisplayedProduct prod = new DisplayedProduct(products.get(i).getIdproduct().toString(), nameProducts.get(i).toString(), namePictures.get(i).toString(), products.get(i).getPriceu());
			
			displayedProducts.add(prod);
		}
		return displayedProducts;
	}	
}
