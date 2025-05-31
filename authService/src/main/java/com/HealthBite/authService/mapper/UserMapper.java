package com.HealthBite.authService.mapper;

import java.time.LocalDateTime;
import java.util.List;

import com.HealthBite.authService.dto.UserRequestDto;
import com.HealthBite.authService.dto.UserResponseDto;
import com.HealthBite.authService.dto.UserUpdateDto;
import com.HealthBite.authService.entity.User;

public class UserMapper {
	
	public static User toEntity(UserRequestDto dto) {
		User user = new User();
		user.setEmpId(dto.getEmpId());
		user.setUserName(dto.getUserName());
		user.setPassword(dto.getPassword());
		user.setEmail(dto.getEmail());
		user.setClmid(dto.getClmid());
		
		return user;
	}
	
	public static UserResponseDto toDto(User user, List<String> roles) {
		UserResponseDto dto = new UserResponseDto();
		
		dto.setUserId(user.getUserId());
		dto.setUserName(user.getUserName());
		dto.setEmail(user.getEmail());
		dto.setIsActive(user.getIsActive());
		dto.setRoles(roles);
		
		return dto;
	}

	public static User toEntity(UserUpdateDto dto, User existingUser) {
	    if (dto.getEmail() != null) {
	        existingUser.setEmail(dto.getEmail());
	    }
	    if (dto.getPassword() != null) {
	        existingUser.setPassword(dto.getPassword()); // Encode in service
	    }
	    if (dto.getIsActive() != null) {
	        existingUser.setIsActive(dto.getIsActive());
	    }
	    if (dto.getMlmid() != null) {
	        existingUser.setMlmid(dto.getMlmid());
	    }

	    existingUser.setMdt(LocalDateTime.now());

	    return existingUser;
	}


}
