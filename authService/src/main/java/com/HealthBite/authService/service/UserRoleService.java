package com.HealthBite.authService.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthBite.authService.dto.UserRoleRequestDto;
import com.HealthBite.authService.dto.UserRoleResponseDto;
import com.HealthBite.authService.entity.Role;
import com.HealthBite.authService.entity.User;
import com.HealthBite.authService.entity.UserRole;
import com.HealthBite.authService.mapper.UserRoleMapper;
import com.HealthBite.authService.repository.RoleRepository;
import com.HealthBite.authService.repository.UserRepository;
import com.HealthBite.authService.repository.UserRoleRepository;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public UserRoleResponseDto assignRole(UserRoleRequestDto dto) {
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found"));

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        userRole.setIsActive(dto.getIsActive());
        userRole.setClmid(dto.getClmid());
        userRole.setCdt(LocalDateTime.now());

        userRoleRepository.save(userRole);

        return UserRoleMapper.toDto(userRole);
    }

    public List<UserRoleResponseDto> getRolesForUser(Integer userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<UserRole> roles = userRoleRepository.findByUser(user);
        return roles.stream().map(UserRoleMapper::toDto).collect(Collectors.toList());
    }
}