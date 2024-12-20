package com.example.controlegraphql;

import com.example.controlegraphql.dao.Student;
import com.example.controlegraphql.dao.StudentRepository;
import com.example.controlegraphql.dto.StudentDTO;
import com.example.controlegraphql.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.util.List;

@SpringBootApplication
public class ControleGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleGraphQlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentRepository studentRepository) {
        return args -> {

             Student studentDTO=new Student();
                studentDTO.setName("yassine");
                studentDTO.setEmail("yassine@gmail.com");
                studentDTO.setDateNaissance(Date.valueOf("2025-12-12"));
            studentRepository.save(studentDTO);

            Student studentDTO1 = new Student();
            studentDTO1.setName("ahmed");
            studentDTO1.setEmail("ahmed@gmail.com");
            studentDTO1.setDateNaissance(Date.valueOf("2025-12-10"));
            studentRepository.save(studentDTO1);
        };
    }
}
