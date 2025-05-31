package com.HealthBite.authService.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.HealthBite.authService.dto.ApiResponseDto;
import com.HealthBite.authService.dto.LoginRequestDto;
import com.HealthBite.authService.dto.LoginResponseDto;
import com.HealthBite.authService.dto.UserRequestDto;
import com.HealthBite.authService.dto.UserResponseDto;
import com.HealthBite.authService.dto.UserUpdateDto;
import com.HealthBite.authService.entity.User;
import com.HealthBite.authService.mapper.LoginMapper;
import com.HealthBite.authService.mapper.UserMapper;
import com.HealthBite.authService.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDto createUser(UserRequestDto dto) {
        User user = UserMapper.toEntity(dto);
        
        if(userRepository.existsByUserName(dto.getUserName())) {
        	throw new RuntimeException("User Already exists");
        }
        
        if(userRepository.existsByEmail(dto.getEmail())) {
        	throw new RuntimeException("Email Already exists");
        }
        
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCdt(LocalDateTime.now());
        userRepository.save(user);
        return UserMapper.toDto(user, List.of("USER")); // or load roles dynamically
    }

    @Override
    public UserResponseDto getUserById(Integer id) {
        User user = userRepository.findByUserId(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDto(user, List.of("USER")); // Example
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> UserMapper.toDto(user, List.of("USER")))
                .toList();
    }

    @Override
    public UserResponseDto updateUser(Integer id, UserUpdateDto dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        
        if(dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            user.setPassword(passwordEncoder.encode(dto.getPassword()));
        }
        
        user = UserMapper.toEntity(dto, user);
        user.setMdt(LocalDateTime.now());
        userRepository.save(user);
        return UserMapper.toDto(user, List.of("USER"));
    }

    @Override
    @Transactional
    public ApiResponseDto<Void> deleteUser(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setIsActive(false);
        user.setMdt(LocalDateTime.now());
        userRepository.save(user);
        return new ApiResponseDto<>(true, "User deactivated successfully", null);
    }

    @Override
    public LoginResponseDto login(LoginRequestDto loginRequest) {
        Optional<User> userOpt = userRepository.findByUserName(loginRequest.getUserName());
        if (userOpt.isEmpty()) throw new RuntimeException("Invalid credentials");

        User user = userOpt.get();
        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        
        if (!user.getIsActive()) {
            throw new RuntimeException("User account is deactivated");
        }

        // Generate JWT or token here (placeholder)
        String token = "dummy-jwt-token";
        return LoginMapper.toDto(user, token, List.of("USER"));
    }

}
