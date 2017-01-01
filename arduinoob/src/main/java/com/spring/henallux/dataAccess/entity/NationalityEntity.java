package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Translationnationality")
public class NationalityEntity {
	
	@Id
	@Column(name="idtranslationnamenationality")
	private Integer idTranslationNameNationality;
	
	@Column(name="translationnamenationality")
	private String translationNameNationality;
	
	@Column(name="idlang")
	private String idLang;
	
	@Column(name="idnationalitytr")
	private String idNationalityTr;
	
	public NationalityEntity()
	{
		
	}
	
	public void seIdTranslationNameNationality(Integer id)
	{ 
		idTranslationNameNationality = id;
	}
	public void setTranslationNameNationality(String trN)
	{ 
		translationNameNationality = trN;
	}
	public void setidLang(String idLng)
	{ 
		idLang = idLng;
	}
	public void setIdNationalityTr(String idN)
	{ 
		idNationalityTr = idN;
	}
	
	public Integer getidTranslationNameNationality()
	{ 
		return idTranslationNameNationality;
	}
	public String getTranslationNameNationality()
	{ 
		return translationNameNationality;
	}
	public String getidLang()
	{ 
		return idLang;
	}
	public String getIdNationalityTr()
	{ 
		return idNationalityTr;
	}

}
