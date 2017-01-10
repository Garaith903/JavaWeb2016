package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.PromotionEntity;
import com.spring.henallux.dataAccess.repository.PromotionRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Promotion;

@Service
@Transactional
public class PromotionDAO {
	
	@Autowired
	private PromotionRepository promotionRespository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public Promotion getThePromoOfTheCurrentWeek(String idWeek)
	{
		PromotionEntity promotionFound = null;
		
		promotionFound = promotionRespository.getOne(idWeek);
		
		if(promotionFound != null)
		{
			
			Promotion promotionOfTheWeek = providerConverter.ConvertPromotionEntityToPromotionModel(promotionFound);
			return promotionOfTheWeek;
		}
		else
		{
			return null;
		}
	}

}
