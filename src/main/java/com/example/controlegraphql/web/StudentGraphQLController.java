package com.example.controlegraphql.web;

import com.example.controlegraphql.dao.Student;
import com.example.controlegraphql.dto.StudentDTO;
import com.example.controlegraphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class StudentGraphQLController {
    @Autowired
    private  StudentService studentService;


    @QueryMapping
    public List<StudentDTO> getStudentsByDateNaissance(@Argument Date dateNaissance) {
        return studentService.getStudentsByDateNaissance(dateNaissance);
    }

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO studentDTO) {
        return studentService.saveStudent(studentDTO);
    }
}
