package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.PictureEntity;
import com.spring.henallux.dataAccess.repository.PictureRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Picture;
import com.spring.henallux.model.Product;

@Service
@Transactional
public class PictureDAO 
{
	@Autowired
	private PictureRepository pictureRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public ArrayList<String> getAllNamePicture(ArrayList<Product> productsList)
	{
		ArrayList<String> namePics = new ArrayList<String>();
		
		for(Product product : productsList)
		{
			Picture pic = getPictureById(product.getIdproduct());
			namePics.add(pic.getNamepic());
		}
		return namePics;
	}
	
	public Picture getPictureById(String idProd)
	{
		List<PictureEntity> pictureEntity = pictureRepository.findAll();
		Picture pic = null;
		for(PictureEntity pEnt : pictureEntity)
		{
			Picture pictureModel = providerConverter.ConvertPictureEntityToPictureModel(pEnt);
			if(pictureModel.getIdprodc().equals(idProd))
			{
				pic = pictureModel;
			}
		}
		return pic;
	}
}