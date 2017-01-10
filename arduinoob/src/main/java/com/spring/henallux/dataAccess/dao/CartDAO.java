package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.CartEntity;
import com.spring.henallux.dataAccess.repository.CartRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.Cart;

@Service
@Transactional
public class CartDAO {
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public int getTheNumberOfCarts()
	{
		return (int)cartRepository.count();
	}
	
	public Cart saveCart(Cart cartToSave)
	{
		CartEntity cartEntity;
		
		cartEntity = providerConverter.ConvertCartModelToCartEntity(cartToSave);
		cartRepository.save(cartEntity);
		
		return providerConverter.ConvertCartEntityToCartModel(cartEntity);
	}


}
