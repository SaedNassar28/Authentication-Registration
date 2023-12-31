package com.coffeeshop.Authentication.Entity;

import com.coffeeshop.Authentication.Dto.UserDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "id" , length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username", length = 256)
    private String username;
    @Column(name = "password", length = 256)
    private String password;
    @Column(name = "role", length = 128)
    private String role;

    public User(Long id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public User() {
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
