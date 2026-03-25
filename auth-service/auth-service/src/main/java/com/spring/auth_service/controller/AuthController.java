package com.spring.auth_service.controller;

import com.spring.auth_service.entity.User;
import com.spring.auth_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/auth")
    @RequiredArgsConstructor
    public class AuthController {
        private final AuthService authService;

        @PostMapping("/signup")
        public String signup(@RequestBody User user) {
            return authService.register(user);
        }

        @PostMapping("/login")
        public String login(@RequestBody User user) {
            return authService.login(user.getUsername(), user.getPassword());
        }

    @GetMapping("/hello")
    public String hello() {
        return "Hello secured user!";
    }

    }

