package com.example.ecommerce.auth.controller;

import com.example.ecommerce.auth.dto.LoginRequestDTO;
import com.example.ecommerce.auth.dto.RegisterRequestDTO;
import com.example.ecommerce.auth.service.AuthService;
import com.example.ecommerce.dto.ApiResponse;
import com.example.ecommerce.user.entity.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/register")
    public ApiResponse<?> register(@Valid @RequestBody RegisterRequestDTO request) {

        authService.register(request);

        return ApiResponse.success(
                "User registered successfully",
                null
        );
    }
    @PostMapping("/login")
    public ApiResponse<?> login(@Valid @RequestBody LoginRequestDTO request) {

        User user = authService.login(request);

        return ApiResponse.success(
                "Login successful",
                Map.of(
                        "userId", user.getId(),
                        "email", user.getEmail(),
                        "role", user.getRole()
                )
        );
    }
}
