package com.example.springboot_security_jwt.service;

import com.example.springboot_security_jwt.model.ERole;
import com.example.springboot_security_jwt.model.Roles;

import java.util.Optional;

public interface RoleService {
    Optional<Roles> findByRoleName(ERole roleName);
}
