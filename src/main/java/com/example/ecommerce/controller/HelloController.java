package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ApiResponse<String> hello() {
        return ApiResponse.success("Hello API working", "OK");
    }
}
