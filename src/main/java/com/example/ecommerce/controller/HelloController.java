package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/v1/hello")
    public ApiResponse<String> hello() {
        return new ApiResponse<>(true, "Hello API working", "Hello World");
    }
}
