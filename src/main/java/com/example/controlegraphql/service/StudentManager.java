package com.example.controlegraphql.service;

import com.example.controlegraphql.dao.Student;
import com.example.controlegraphql.dao.StudentRepository;
import com.example.controlegraphql.dto.StudentDTO;
import com.example.controlegraphql.dto.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class StudentManager implements StudentService {
    @Autowired
    private  StudentRepository studentRepository;
    @Autowired
    private  StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(Date dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.toStudentDTO(student));
        }
        return studentDTOS;
    }
    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        System.out.println(studentDTO.toString());
        return studentMapper.toStudentDTO(studentRepository.save(studentMapper.toStudent(studentDTO)));

    }



}
