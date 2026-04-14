package Biswajit.demo.controller;

import Biswajit.demo.dto.request.RegisterRequest;
import Biswajit.demo.dto.response.RegisterResponse;
import Biswajit.demo.service.RegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/auth")
public class RegisterController {
    private final RegisterService service;

    public RegisterController(RegisterService service) {
        this.service = service;
    }

    @PostMapping("/register")
    private ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        RegisterResponse response = service.registerResponse(request);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }


}
