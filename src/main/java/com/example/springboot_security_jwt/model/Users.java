package com.example.springboot_security_jwt.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;
    @Column(name = "UserName", unique = true, nullable = false)
    private String userName;
    @Column(name = "Password", nullable = false)
    private String password;
    @Column(name = "Created")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date created;
    @Column(name = "Email", nullable = false, unique = true)
    private String email;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "UserStatus")
    private boolean userStatus;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "User_Role", joinColumns = @JoinColumn(name = "UserId"),
            inverseJoinColumns = @JoinColumn(name = "RoleId"))
    private Set<Roles> listRoles = new HashSet<>();
}

