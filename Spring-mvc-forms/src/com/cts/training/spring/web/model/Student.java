package com.cts.training.spring.web.model;

public class Student {

	private String uname;
	private String email;
	
	private String favoriteLanguage;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		
			
		return email;
	}
	
	
	
	public String getFavoritelanguage() {
		return favoriteLanguage;
	}
	public void setFavoritelanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public void setEmail(String email) {
		this.email = email;
		if(this.email == null)
			this.email = "dummy@mail.com";
	}
	
	
}
