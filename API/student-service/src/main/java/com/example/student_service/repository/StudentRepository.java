package com.example.university_monolithic.repository;

import com.example.university_monolithic.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
