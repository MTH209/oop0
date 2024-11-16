package com.example.management.repository;

import com.example.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFullNameContaining(String name);
}
