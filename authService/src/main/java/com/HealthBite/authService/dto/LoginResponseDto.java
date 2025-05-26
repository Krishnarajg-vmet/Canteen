package com.HealthBite.authService.dto;

import java.util.*;

public class LoginResponseDto {
	
	private String token;
    private String userName;
    private String email;
    private List<String> roles;
    private Boolean isActive;

    public LoginResponseDto(String token, String userName, String email, List<String> roles, Boolean isActive) {
        this.token = token;
        this.userName = userName;
        this.email = email;
        this.roles = roles;
        this.isActive = isActive;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

    
}
