package com.example.controlegraphql.dao;

import com.example.controlegraphql.dto.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(Date dateNaissance);
}
