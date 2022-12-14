package com.example.userorgmapping.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
public class HallTicket {
    private Integer hallTicketNumber;
    private Integer roomNumber;
}
