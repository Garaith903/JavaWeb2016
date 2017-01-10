package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.repository.LineProductRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.LineProduct;

@Service
@Transactional
public class LineProductDAO {

	@Autowired
	private LineProductRepository lineProductRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public int getTheNumberOfLines()
	{
		return (int)lineProductRepository.count();
	}
	
	public void SaveLineProduct(ArrayList<LineProduct> linesToSave)
	{
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		for(LineProduct line : linesToSave)
		{
			session.save(providerConverter.ConvertLineProductModelToLineProductEntity(line));
		}
		session.getTransaction().commit();
	}
	
}
