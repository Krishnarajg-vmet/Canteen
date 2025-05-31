package com.HealthBite.authService.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.HealthBite.authService.dto.ApiResponseDto;
import com.HealthBite.authService.dto.RoleRequestDto;
import com.HealthBite.authService.dto.RoleResponseDto;
import com.HealthBite.authService.dto.UserResponseDto;
import com.HealthBite.authService.dto.UserUpdateDto;
import com.HealthBite.authService.entity.Role;
import com.HealthBite.authService.entity.User;
import com.HealthBite.authService.mapper.RoleMapper;
import com.HealthBite.authService.mapper.UserMapper;
import com.HealthBite.authService.repository.RoleRepository;

import jakarta.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleResponseDto createRole(RoleRequestDto dto) {
        Role role = RoleMapper.toEntity(dto);
        role.setCdt(LocalDateTime.now());
        role.setIsActive(true);
        roleRepository.save(role);
        return RoleMapper.toDto(role);
    }

    @Override
    public RoleResponseDto getRoleById(Short id) {
        Role role = roleRepository.findByRoleId(id)
                .orElseThrow(() -> new RuntimeException("Role Not Found"));
        return RoleMapper.toDto(role);
    }

    @Override
    public List<RoleResponseDto> getAllRoles() {
        return roleRepository.findAll()
                .stream()
                .map(RoleMapper::toDto)
                .toList();
    }

    @Override
    public RoleResponseDto updateRole(Short id, RoleRequestDto dto) {
        Role role = roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        role.setRoleName(dto.getRoleName());
        role.setRoleCode(dto.getRoleCode());
        role.setRoleDescription(dto.getRoleDescription());
        role.setMdt(LocalDateTime.now());

        roleRepository.save(role);
        return RoleMapper.toDto(role);
    }

    @Override
    @Transactional
    public ApiResponseDto<Void> deactivateRole(Short id) {
        Role role = roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));

        role.setIsActive(false);
        role.setMdt(LocalDateTime.now());

        roleRepository.save(role);
        return new ApiResponseDto<>(true, "Role deactivated successfully", null);
    }
}
