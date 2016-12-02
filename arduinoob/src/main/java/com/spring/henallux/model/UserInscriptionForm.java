package com.spring.henallux.model;

public class UserInscriptionForm 
{
	private String pseudo;
	private String password;
	private String firstName;
	private String lastName;
	private String adress;
	private java.util.Date birthdate;
	private Boolean sex;
	private String nationality;
	private String email;
	private String mobileNumber;
	private String fixNumber;
	
	public UserInscriptionForm(){}
	
	public void setPseudo(String ps){ pseudo = ps; }
	public void setPassword(String pW){ password = pW; }
	public void setFirstName(String fN){ firstName = fN; }
	public void setLastName(String lN){ lastName = lN; }
	public void setAdress(String adr){ adress = adr; }
	public void setBirthdate(java.util.Date bD){ birthdate = bD; }
	public void setSex(Boolean sx){ sex = sx; }
	public void setNationality(String nat){ nationality = nat; }
	public void setEmail(String eM){ email = eM; }
	public void setMobileNumber(String mN){ mobileNumber = mN; }
	public void setFixNumber(String fN){ fixNumber = fN; }
	
	public String getPseudo(){ return pseudo; }
	public String getPassword(){ return password; }
	public String getFirstName(){ return firstName; }
	public String getLastName(){ return lastName; }
	public String getAdress(){ return adress; }
	public java.util.Date getBirthdate(){ return birthdate; }
	public Boolean getSex(){ return sex; }
	public String getNationality(){ return nationality; }
	public String getEmail(){ return email; }
	public String getMobileNumber(){ return mobileNumber; }
	public String getFixNumber(){ return fixNumber; }
	
	

}
