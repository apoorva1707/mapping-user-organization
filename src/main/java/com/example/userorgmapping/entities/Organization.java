package com.example.userorgmapping.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity(name = "organization")
@NoArgsConstructor
@Data
public class Organization {

    private Integer organizationId;
    private String organizationName;

}
