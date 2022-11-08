package com.example.userorgmapping.repository;

import com.example.userorgmapping.entities.Course;
import com.example.userorgmapping.entities.Organization;
import com.example.userorgmapping.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByOrganization(Optional<Organization>organization, Pageable pageable);
    List<User>findByCourse(Optional<Course> course);

    Page<User>findAll(Pageable pageable);
    Optional<User>findByEmail(String email);
}
