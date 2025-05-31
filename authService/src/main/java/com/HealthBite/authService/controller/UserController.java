package com.HealthBite.authService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.HealthBite.authService.dto.ApiResponseDto;
import com.HealthBite.authService.dto.UserRequestDto;
import com.HealthBite.authService.dto.UserResponseDto;
import com.HealthBite.authService.dto.UserUpdateDto;
import com.HealthBite.authService.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto dto) {
        return userService.createUser(dto);
    }

    @GetMapping("/{id}")
    public UserResponseDto getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<UserResponseDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public UserResponseDto updateUser(@PathVariable Integer id, @RequestBody UserUpdateDto dto) {
        return userService.updateUser(id, dto);
    }

    @DeleteMapping("/{id}")
    public ApiResponseDto<Void> deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}