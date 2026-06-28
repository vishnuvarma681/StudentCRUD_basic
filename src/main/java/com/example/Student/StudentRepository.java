package com.example.Student;

import com.example.Student.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Integer> {
}
