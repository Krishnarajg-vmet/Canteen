package com.HealthBite.authService.service;

import java.util.*;

import com.HealthBite.authService.dto.ApiResponseDto;
import com.HealthBite.authService.dto.LoginRequestDto;
import com.HealthBite.authService.dto.LoginResponseDto;
import com.HealthBite.authService.dto.UserRequestDto;
import com.HealthBite.authService.dto.UserResponseDto;
import com.HealthBite.authService.dto.UserUpdateDto;

public interface UserService {
	
	UserResponseDto createUser(UserRequestDto dto);
    UserResponseDto getUserById(Integer id);
    List<UserResponseDto> getAllUsers();
    UserResponseDto updateUser(Integer id, UserUpdateDto dto);
    ApiResponseDto<Void> deleteUser(Integer id);
    LoginResponseDto login(LoginRequestDto loginRequest);

}
