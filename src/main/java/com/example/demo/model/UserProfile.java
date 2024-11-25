package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserProfile {
    @Id
    private Integer userId;
    private String firstName;
    private String secondName;
    private String username;
    private String password;
    private LocalDateTime createdAt;

}
