package com.example.springboot_security_jwt.service;

import com.example.springboot_security_jwt.model.ERole;
import com.example.springboot_security_jwt.model.Roles;
import com.example.springboot_security_jwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Optional<Roles> findByRoleName(ERole roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
