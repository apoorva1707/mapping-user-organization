package com.example.userorgmapping.repository;

import com.example.userorgmapping.entities.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    Optional<Course> findByCourseName(String courseName);
    Page<Course> findAll(Pageable pageable);
}
