package com.skilltranfer.skilltrafer.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(updatable = false)
    private LocalDate created_at;

    public User() {

    }

    public User(String username, String password, String email) {
        this.created_at = LocalDate.now();
        this.username = username;
        this.password = password;
        this.email = email;
    }


}
