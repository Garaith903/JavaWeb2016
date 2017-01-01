package com.spring.henallux.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInscriptionForm 
{
	@NotNull
	@Size(min=3,max=15)
	private String pseudo;
	@NotNull
	@Size(min=3,max=32)
	private String password;
	@NotNull
	@Size(min=3,max=32)
	private String passwordCheck;
	@NotNull
	@Size(min=3,max=30)
	private String firstName;
	@NotNull
	@Size(min=3,max=30)
	private String lastName;
	@NotNull
	@Size(min=10,max=50)
	private String address;
	@NotNull
	private String birthdate;
	@NotNull
	private String sex;
	@NotNull
	@Size(min=3,max=100)
	private String count;
	@NotNull
	@Size(min=3,max=50)
	private String email;
	@NotNull
	@Size(min=6,max=10)
	private String mobileNumber;
	
	public UserInscriptionForm(){}
	
	public UserInscriptionForm(String ps, String pass, String passCk, String firstN, String lastN, String adr, String bD,  String sx, String cnt, String eml, String mobile)
	{
		pseudo = ps;
		password = pass;
		passwordCheck = passCk;
		firstName = firstN;
		lastName = lastN;
		address = adr;
		birthdate = bD;
		sex = sx;
		count = cnt;
		email = eml;
		mobileNumber = mobile;	
	}
	
	
	public void setPseudo(String ps){ pseudo = ps; }
	public void setPassword(String pW){ password = pW; }
	public void setPasswordCheck(String pWCk){ passwordCheck = pWCk; }
	public void setFirstName(String fN){ firstName = fN; }
	public void setLastName(String lN){ lastName = lN; }
	public void setAddress(String adr){ address = adr; }
	//public void setBirthdate(java.util.Date bD){ birthdate = bD; }
	public void setBirthdate(String bD){ birthdate = bD; }
	public void setSex(String sx){ sex = sx; }
	public void setCount(String ct){ count = ct; }
	public void setEmail(String eM){ email = eM; }
	public void setMobileNumber(String mN){ mobileNumber = mN; }
	
	public String getPseudo(){ return pseudo; }
	public String getPassword(){ return password; }
	public String getPasswordCheck() { return passwordCheck; }
	public String getFirstName(){ return firstName; }
	public String getLastName(){ return lastName; }
	public String getAddress(){ return address; }
	//public java.util.Date getBirthdate(){ return birthdate; }
	public String getBirthdate(){ return birthdate; }
	public String getSex(){ return sex; }
	public String getCount(){ return count; }
	public String getEmail(){ return email; }
	public String getMobileNumber(){ return mobileNumber; }
	
	public java.util.Date convertStringDateToJavaUtilDate(String bD)
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date parsed;
		try 
		{
			parsed = format.parse(bD);
			return parsed;
			
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
