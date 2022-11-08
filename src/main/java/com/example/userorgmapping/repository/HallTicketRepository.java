package com.example.userorgmapping.repository;

import com.example.userorgmapping.entities.HallTicket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallTicketRepository extends JpaRepository<HallTicket,Integer> {
    Page<HallTicket> findAll(Pageable pageable);
}
