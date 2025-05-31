package com.HealthBite.authService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.HealthBite.authService.dto.LoginRequestDto;
import com.HealthBite.authService.dto.LoginResponseDto;
import com.HealthBite.authService.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequestDto request) {
        return userService.login(request);
    }
}