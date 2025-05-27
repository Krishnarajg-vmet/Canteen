package com.HealthBite.authService.dto;

public class UserRoleRequestDto {
	
	private Integer userId;
    private Short roleId;
    private Boolean isActive;
    private Integer clmid;
    
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Short getRoleId() {
		return roleId;
	}
	public void setRoleId(Short roleId) {
		this.roleId = roleId;
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
    
    

}
