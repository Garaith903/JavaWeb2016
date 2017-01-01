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
	
	public ArrayList<TranslationProduct> getProducts()
	{
		List<TranslationProductEntity> listTranslProducts = translationProductRepository.findAll();
		
		ArrayList<TranslationProduct> translationProducts = new ArrayList<TranslationProduct>();
		for(TranslationProductEntity transProductEnt : listTranslProducts)
		{
			TranslationProduct transProd = providerConverter.ConvertTranslationProductEntityToTranslationProductModel(transProductEnt);
			translationProducts.add(transProd);
		}
		
		return translationProducts;
	}

}
