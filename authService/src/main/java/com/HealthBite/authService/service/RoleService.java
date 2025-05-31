package com.HealthBite.authService.service;

import java.util.List;

import com.HealthBite.authService.dto.ApiResponseDto;
import com.HealthBite.authService.dto.RoleRequestDto;
import com.HealthBite.authService.dto.RoleResponseDto;

public interface RoleService {
	
	RoleResponseDto createRole(RoleRequestDto dto);
    RoleResponseDto getRoleById(Short id);
    List<RoleResponseDto> getAllRoles();
    RoleResponseDto updateRole(Short id, RoleRequestDto dto);
    ApiResponseDto<Void> deactivateRole(Short id);

}
