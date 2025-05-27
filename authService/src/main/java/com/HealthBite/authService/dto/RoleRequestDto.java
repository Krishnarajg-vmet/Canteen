package com.HealthBite.authService.dto;

public class RoleRequestDto {

	private String roleName;
    private String roleCode;
    private String roleDescription;
    private Integer clmid;
    
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
	public Integer getClmid() {
		return clmid;
	}
	public void setClmid(Integer clmid) {
		this.clmid = clmid;
	}
    
    
}
