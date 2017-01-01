package com.spring.henallux.dataAccess.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.CategoryEntity;
import com.spring.henallux.dataAccess.repository.CategoryRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Category;


@Service
@Transactional
public class CategoryDAO {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public ArrayList<Category> getCategory()
	{
		String lang = "fra";
		List<CategoryEntity> categoryEntities = categoryRepository.findAll();
		ArrayList<Category> listCategory = new ArrayList<Category>();
		Category catAll;
		if(lang.equals("fra"))
		{
			catAll = new Category(0, "Toutes les catégories", "fra", "all");
		}
		else
		{
			catAll = new Category(0, "All categories", "eng", "all");
		}
		listCategory.add(catAll);
		for(CategoryEntity categEnt : categoryEntities)
		{
			Category cat = new Category();
			cat = providerConverter.ConvertCategoryEntityToCategoryModel(categEnt);
			listCategory.add(cat);
		}
		return listCategory;
	}
}
