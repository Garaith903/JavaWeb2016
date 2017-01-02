package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.ProductEntity;
import com.spring.henallux.dataAccess.entity.TranslationProductEntity;
import com.spring.henallux.dataAccess.repository.ProductRepository;
import com.spring.henallux.dataAccess.repository.TranslationProductRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.TranslationProduct;

@Service
@Transactional
public class TranslationProductDAO {
	
	@Autowired
	private TranslationProductRepository translationProductRepository;
	@Autowired
	private ProviderConverter providerConverter ;
	
	public ArrayList<TranslationProduct> getProducts(String lng)
	{
		String filterLng = (lng.equals("en"))?"eng":"fra";
		
		List<TranslationProductEntity> listTranslProducts = translationProductRepository.findAll();
		
		ArrayList<TranslationProduct> translationProducts = new ArrayList<TranslationProduct>();
		for(TranslationProductEntity transProductEnt : listTranslProducts)
		{
			TranslationProduct transProd = providerConverter.ConvertTranslationProductEntityToTranslationProductModel(transProductEnt);
			
			if(transProd.getIdlang().equals(filterLng))
			{
				translationProducts.add(transProd);
			}
		}
		
		return translationProducts;
	}
	
	public ArrayList<String> getTranslationProducts(ArrayList<Product> productsByCategory, String lng)
	{
		String filterLng = (lng.equals("en"))?"eng":"fra";
		ArrayList<String> listTanslattionNameProducts = new ArrayList<String>();
		
		for(Product pr : productsByCategory)
		{
			String name = getOneTranslation(pr, filterLng);
			listTanslattionNameProducts.add(name);
		}
		
		return listTanslattionNameProducts;
	}
	
	public String getOneTranslation(Product pr, String lng)
	{
		String translation = "";
		List<TranslationProductEntity> listTranslProducts = translationProductRepository.findAll();
		ArrayList<TranslationProductEntity> listTranslProductLng = new ArrayList<TranslationProductEntity>();
		
		for(TranslationProductEntity trEnt : listTranslProducts)
		{
			if(trEnt.getIdlang().equals(lng))
			{
				listTranslProductLng.add(trEnt);
			}
		}
		
		for(TranslationProductEntity trEntit : listTranslProductLng)
		{
			if(trEntit.getIdprod().equals(pr.getIdproduct()))
			{
				translation = trEntit.getTranslationname();
			}
		}
		return translation;
	}
	

}
