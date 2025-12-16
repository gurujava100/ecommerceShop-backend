package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/api/v1/health")
    public ApiResponse<String> health() {
        return new ApiResponse<>(true, "Service is UP", "UP");
    }
}
