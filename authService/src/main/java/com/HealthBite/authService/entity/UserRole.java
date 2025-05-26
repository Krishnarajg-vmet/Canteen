package com.HealthBite.authService.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "userRole")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userRoleId")
	private Integer userRoleId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleId", nullable = false)
	private Role role;
	
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

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
