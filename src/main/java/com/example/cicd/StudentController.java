package com.example.cicd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent() {
         return List.of(new Student("Alisher", 22), new Student("Baxtiyor", 23));
    }
}
