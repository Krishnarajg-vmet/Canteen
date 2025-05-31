package com.HealthBite.authService.mapper;

import com.HealthBite.authService.dto.RoleRequestDto;
import com.HealthBite.authService.dto.RoleResponseDto;
import com.HealthBite.authService.entity.Role;

public class RoleMapper {
	
	public static Role toEntity(RoleRequestDto dto) {
		
		Role role = new Role();
		
		role.setRoleName(dto.getRoleName());
		role.setRoleCode(dto.getRoleCode());
        role.setRoleDescription(dto.getRoleDescription());
        role.setClmid(dto.getClmid());		
		
		return role;
	}
	
	public static RoleResponseDto toDto(Role role) {
		
		RoleResponseDto dto = new RoleResponseDto();
		
		dto.setRoleId(role.getRoleId());
		dto.setRoleName(role.getRoleName());
		dto.setRoleCode(role.getRoleCode());
		dto.setRoleDescription(role.getRoleDescription());
		dto.setIsActive(role.getIsActive());
		
		return dto;
	}

}
