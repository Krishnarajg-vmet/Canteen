package com.HealthBite.authService.dto;

public class UserUpdateDto {
	
	private String email;
    private String password;
    private Boolean isActive;
    private Integer mlmid;
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getMlmid() {
		return mlmid;
	}
	public void setMlmid(Integer mlmid) {
		this.mlmid = mlmid;
	}
    

}
