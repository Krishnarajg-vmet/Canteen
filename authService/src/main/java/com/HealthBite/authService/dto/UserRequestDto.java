package com.HealthBite.authService.dto;

public class UserRequestDto {
	
	private Integer empId;
    private String userName;
    private String password;
    private String email;
    private Integer clmid;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getClmid() {
		return clmid;
	}
	public void setClmid(Integer clmid) {
		this.clmid = clmid;
	}
    

}
