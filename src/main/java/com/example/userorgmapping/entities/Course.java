package com.example.userorgmapping.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Course {

    private Integer courseId;
    private String courseName;

}
