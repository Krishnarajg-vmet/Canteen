package com.HealthBite.authService.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table (name = "roles")
public class Role {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "roleId")
	private Short roleId;
	
	@Column(name = "roleName", nullable = false, unique = true, length=50)
	private String roleName;
	
	@Column(name = "roleCode", nullable = false, unique = true, length = 3)
	private String roleCode;
	
	@Column(name = "roleDescription", nullable = false, length = 255)
	private String roleDescription;
	
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

	public Short getRoleId() {
		return roleId;
	}

	public void setRoleId(Short roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
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
