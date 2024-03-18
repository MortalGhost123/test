package com.example.testcontainer.repository;

import com.example.testcontainer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
