package com.example.userorgmapping.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "users")
@NoArgsConstructor
@Data
public class User {

    private Integer userId;
    private String userName;
    private LocalDate dateOfBirth;

    private String email;

}
