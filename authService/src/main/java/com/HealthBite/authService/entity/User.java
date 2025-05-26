package com.HealthBite.authService.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table (name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private Integer userId;
	
	@Column(name = "empId", nullable = false, unique = true)
	private Integer empId;
	
	@Column(name = "userName", nullable = false, unique = true, length = 8)
	private String userName;
	
	@Column(name = "password", nullable = false, length = 255)
	private String password;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "isActive", nullable = false)
	private Boolean isActive = true;
	
	@Column(name = "clmid", nullable = false)
	private Integer clmid;
	
	@Column(name = "cdt", nullable = false)
	private LocalDateTime cdt;
	
	@Column(name = "mlmid")
	private Integer mlmid;
	
	@Column(name = "mdt")
	private LocalDateTime mdt;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getClmid() {
		return clmid;
	}

	public void setClmid(Integer clmid) {
		this.clmid = clmid;
	}

	public LocalDateTime getCdt() {
		return cdt;
	}

	public void setCdt(LocalDateTime cdt) {
		this.cdt = cdt;
	}

	public Integer getMlmid() {
		return mlmid;
	}

	public void setMlmid(Integer mlmid) {
		this.mlmid = mlmid;
	}

	public LocalDateTime getMdt() {
		return mdt;
	}

	public void setMdt(LocalDateTime mdt) {
		this.mdt = mdt;
	}
	

}
