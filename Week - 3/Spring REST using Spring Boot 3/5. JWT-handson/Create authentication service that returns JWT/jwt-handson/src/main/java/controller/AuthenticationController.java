package com.cognizant.jwt_handson.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_handson.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader) {

        String encodedCredentials = authHeader.substring("Basic ".length());

        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

        String decodedCredentials = new String(decodedBytes);

        String username = decodedCredentials.split(":")[0];

        String token = jwtUtil.generateToken(username);

        return "{\"token\":\"" + token + "\"}";
    }
}