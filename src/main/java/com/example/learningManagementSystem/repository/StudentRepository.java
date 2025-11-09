package com.example.learningManagementSystem.repository;

import com.example.learningManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    boolean existsByEmail(String email);
}
