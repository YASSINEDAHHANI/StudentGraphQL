package com.example.controlegraphql.service;

import com.example.controlegraphql.dao.Student;
import com.example.controlegraphql.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
     List<StudentDTO> getStudentsByDateNaissance(Date dateNaissance);
     StudentDTO saveStudent(StudentDTO studentDTO);
}
