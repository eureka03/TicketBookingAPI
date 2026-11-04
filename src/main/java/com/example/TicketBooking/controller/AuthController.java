package com.example.TicketBooking.controller;


import com.example.TicketBooking.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private UserRepository userRepository;

    public AuthController(UserRepository  userRepository){
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> login(@ResponseBody LoginRequest loginRequest){

    }
}
