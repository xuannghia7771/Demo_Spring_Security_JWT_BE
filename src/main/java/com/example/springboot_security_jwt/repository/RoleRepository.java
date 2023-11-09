package com.example.springboot_security_jwt.repository;

import com.example.springboot_security_jwt.model.ERole;
import com.example.springboot_security_jwt.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByRoleName(ERole roleName);
}
