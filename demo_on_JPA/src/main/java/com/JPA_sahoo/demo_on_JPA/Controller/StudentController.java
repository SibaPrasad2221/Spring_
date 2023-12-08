package com.JPA_sahoo.demo_on_JPA.Controller;

import com.JPA_sahoo.demo_on_JPA.Model.Student;
import com.JPA_sahoo.demo_on_JPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiDemo")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public String addStudent(@RequestBody Student s){
        studentService.addStudent(s);
        return "Student added successfully";
    }


}
