package com.HealthBite.authService.mapper;

import com.HealthBite.authService.dto.UserRoleResponseDto;
import com.HealthBite.authService.entity.UserRole;

public class UserRoleMapper {
	
	public static UserRoleResponseDto toDto(UserRole userRole) {
		
		UserRoleResponseDto dto = new UserRoleResponseDto();
		
		dto.setUserRoleId(userRole.getUserRoleId());
		dto.setUserId(userRole.getUser().getUserId());
		dto.setUserName(userRole.getUser().getUserName());
		dto.setRoleId(userRole.getRole().getRoleId());
		dto.setRoleName(userRole.getRole().getRoleName());
		dto.setIsActive(userRole.getIsActive());
		
		return dto;
	}

}
