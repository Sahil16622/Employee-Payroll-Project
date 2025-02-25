package com.example.Employee_Payroll_Project.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")

public class WelcomeController {
    @GetMapping
    public ResponseEntity<String> getWelcomeMessage() {
        return ResponseEntity.ok("Welcome to Employee Payroll Service!");
    }

    @PostMapping("/echo")
    public ResponseEntity<String> echoMessage(@RequestBody String message) {
        return ResponseEntity.ok("Echo: " + message);
    }

}