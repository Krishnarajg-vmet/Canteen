package com.HealthBite.authService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.HealthBite.authService.dto.ApiResponseDto;
import com.HealthBite.authService.dto.RoleRequestDto;
import com.HealthBite.authService.dto.RoleResponseDto;
import com.HealthBite.authService.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public RoleResponseDto createRole(@RequestBody RoleRequestDto dto) {
        return roleService.createRole(dto);
    }

    @GetMapping("/{id}")
    public RoleResponseDto getRole(@PathVariable Short id) {
        return roleService.getRoleById(id);
    }

    @GetMapping
    public List<RoleResponseDto> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PutMapping("/{id}")
    public RoleResponseDto updateRole(@PathVariable Short id, @RequestBody RoleRequestDto dto) {
        return roleService.updateRole(id, dto);
    }

    @DeleteMapping("/{id}")
    public ApiResponseDto<Void> deactivateRole(@PathVariable Short id) {
        return roleService.deactivateRole(id);
    }
}