package com.spring.henallux.model;

public class LoginForm {

	private String pseudo;
	private String password;
	
	public LoginForm(){}
	public LoginForm(String n, String pw){ pseudo = n; password = pw; }
	
	public void setPseudo(String ps){ pseudo = ps; }
	public void setPassword(String pW){ password = pW; }
	
	
	public String getPseudo(){ return pseudo; }
	public String getPassword(){ return password; }
	
}
