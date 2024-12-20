package com.example.controlegraphql.dto;

import com.example.controlegraphql.dao.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();

    public  Student toStudent(StudentDTO studentDTO) {
        return mapper.map(studentDTO, Student.class);
    }

    public  StudentDTO toStudentDTO(Student student) {
        return mapper.map(student, StudentDTO.class);
    }
}
