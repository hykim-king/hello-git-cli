package com.example.member.service;

public class LoginService {

    public boolean login(String id, String password) {
        return "admin".equals(id) && "1234".equals(password);
    }
}