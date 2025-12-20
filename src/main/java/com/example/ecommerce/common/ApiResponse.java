package com.example.ecommerce.common;

public class ApiResponse <T> {
    private boolean success;
    private String message;
    private T data;

    // 🔒 Private constructor (forces use of factory methods)
    private ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // ✅ Success response
    public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>(true, message, data);
    }

    // ✅ Failure response
    public static <T> ApiResponse<T> failure(String message) {
        return new ApiResponse<>(false, message, null);
    }

    // ✅ GETTERS (IMPORTANT FIX)
    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
