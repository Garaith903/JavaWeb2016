package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class UserInscriptionFormEntity{

	@Id
	@Column(name="pseudo")
	private String pseudo;
	
	@Column(name="pwd")
	private String password;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="birthdate")
	private java.util.Date birthdate;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobilenumber")
	private String mobileNumber;
	
	public UserInscriptionFormEntity(){}
	
	public void setPseudo(String ps){ pseudo = ps; }
	public void setPassword(String pW){ password = pW; }
	public void setFirstName(String fN){ firstName = fN; }
	public void setLastName(String lN){ lastName = lN; }
	public void setAddress(String adr){ address = adr; }
	public void setBirthdate(java.util.Date bD){ birthdate = bD; }
	public void setSex(String sx){ sex = sx; }
	public void setCount(String ct){ nationality = ct; }
	public void setEmail(String eM){ email = eM; }
	public void setMobileNumber(String mN){ mobileNumber = mN; }
	
	public String getPseudo(){ return pseudo; }
	public String getPassword(){ return password; }
	public String getFirstName(){ return firstName; }
	public String getLastName(){ return lastName; }
	public String getAddress(){ return address; }
	public java.util.Date getBirthdate(){ return birthdate; }
	public String getSex(){ return sex; }
	public String getCount(){ return nationality; }
	public String getEmail(){ return email; }
	public String getMobileNumber(){ return mobileNumber; }
}
