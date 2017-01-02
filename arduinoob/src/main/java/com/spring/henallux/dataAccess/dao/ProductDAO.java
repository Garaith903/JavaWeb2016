package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.ProductEntity;
import com.spring.henallux.dataAccess.repository.ProductRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Product;

@Service
@Transactional
public class ProductDAO {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProviderConverter providerConverter ;
	
	public ArrayList<Product> getProducts()
	{
		List<ProductEntity> listProducts = productRepository.findAll();
		
		ArrayList<Product> products = new ArrayList<Product>();
		for(ProductEntity productEnt : listProducts)
		{
			Product prod = providerConverter.ConvertProductEntityToProductModel(productEnt);
			products.add(prod);
		}
		
		return products;
	}
	
	public ArrayList<Product> getProductsByCategory(String idCateg)
	{
		List<ProductEntity> listProducts = productRepository.findAll();
		
		ArrayList<Product> products = new ArrayList<Product>();
		for(ProductEntity productEnt : listProducts)
		{
			Product prod = providerConverter.ConvertProductEntityToProductModel(productEnt);
			if(prod.getIdcateg().equals(idCateg) || idCateg.equals("all"))
			{
				products.add(prod);
			}
		}
		
		return products;
	}
}
