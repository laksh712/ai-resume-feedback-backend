package com.airesume.airesumefeedback.controller;

import com.airesume.airesumefeedback.dto.RegisterRequest;
import com.airesume.airesumefeedback.dto.RegisterResponse;
import com.airesume.airesumefeedback.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(
            @RequestBody RegisterRequest request) {

        authService.register(request);
        return ResponseEntity.ok(
                new RegisterResponse("User registered successfully")
        );
    }
}
