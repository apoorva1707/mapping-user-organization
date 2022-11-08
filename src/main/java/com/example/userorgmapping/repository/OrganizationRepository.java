package com.example.userorgmapping.repository;

import com.example.userorgmapping.entities.Organization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization,Integer> {
    Optional<Organization> findByOrganizationName(String organizationName);
    Page<Organization> findAll(Pageable pageable);
}
