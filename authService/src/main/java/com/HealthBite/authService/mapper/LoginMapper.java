package com.HealthBite.authService.mapper;

import java.util.List;

import com.HealthBite.authService.dto.LoginResponseDto;
import com.HealthBite.authService.entity.User;

public class LoginMapper {
	
	public static LoginResponseDto toDto(User user, String token, List<String> roles) {
		
		LoginResponseDto dto = new LoginResponseDto();
		
		dto.setToken(token);
        dto.setUserName(user.getUserName());
        dto.setEmail(user.getEmail());
        dto.setRoles(roles);
        dto.setIsActive(user.getIsActive());
		
		return dto;
	}

}
