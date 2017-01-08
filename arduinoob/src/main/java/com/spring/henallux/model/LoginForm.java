package com.spring.henallux.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

	@NotNull
	@Size(min=3,max=15)
	private String pseudo;
	@NotNull
	@Size(min=3,max=32)
	private String password;
	
	public LoginForm(){}
	public LoginForm(String n, String pw){ pseudo = n; password = pw; }
	
	public void setPseudo(String ps){ pseudo = ps; }
	public void setPassword(String pW){ password = pW; }
	
	
	public String getPseudo(){ return pseudo; }
	public String getPassword(){ return password; }
	
}
