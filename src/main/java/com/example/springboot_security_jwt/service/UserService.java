package com.example.springboot_security_jwt.service;

import com.example.springboot_security_jwt.model.Users;

public interface UserService {
    Users findByUserName(String userName);
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
    Users saveOrUpdate(Users users);
}
