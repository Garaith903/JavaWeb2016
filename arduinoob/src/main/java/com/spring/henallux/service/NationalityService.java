package com.spring.henallux.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.spring.henallux.model.Nationality;


@Service
public class NationalityService {
	
	private ArrayList<Nationality> listCountry;
	
	public NationalityService()
	{
		listCountry = new ArrayList<Nationality>();
		
		listCountry.add(new Nationality(1, "Belgique", "fra", "BEL"));
		listCountry.add(new Nationality(2, "France", "fra", "FRA"));
		listCountry.add(new Nationality(3, "Allemagne", "fra", "DEU"));
	}
	
	public void setListCountry(ArrayList<Nationality> lstC)
	{ 
		listCountry = lstC;
	}
	
	public ArrayList<Nationality> getListCountry()
	{ 
		return listCountry;
	}

}
