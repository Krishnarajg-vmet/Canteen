package com.HealthBite.authService.dto;

public class RoleResponseDto {
	
	private Short roleId;
    private String roleName;
    private String roleCode;
    private String roleDescription;
    private Boolean isActive;
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
    
    
	

}
