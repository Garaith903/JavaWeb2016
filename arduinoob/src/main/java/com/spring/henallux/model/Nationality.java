package com.spring.henallux.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Nationality {
	
	private int id;
	private String translation;
	private String idlang;
	private String idnationality;

	
	public Nationality(){}
	public Nationality(int idt,  String name, String idL, String idN)
	{
		id = idt;
		translation = name;
		idlang = idL;
		idnationality = idN;
	}
	
	public void setId(int idN){ id = idN; }
	public void setTranslation(String n){ translation = n; }
	public void setIdlang(String idL){ idlang = idL; }
	public void setIdnationality(String idN){ idnationality = idN; }
	
	public int getId(){ return id; }
	public String getTranslation(){ return translation; }
	public String getIdlang(){ return idlang; }
	public String getIdnationality(){ return idnationality; }
	

}
