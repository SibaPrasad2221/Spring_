package com.JPA_sahoo.demo_on_JPA.Service;


import com.JPA_sahoo.demo_on_JPA.Model.Student;
import com.JPA_sahoo.demo_on_JPA.Repository.StudentRepository_Using_JPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    StudentRepository_Using_JPA student_repo;

    public void addStudent(Student s){
        //JPA provides some inbuilt methods to perform database operation
        student_repo.save(s); //similar to insert
        //this ensures whatever student object s contains those values will be saved to JPA repository
        //this means instead of writing SQL queries to insert the data into database we can use JPA builtin methods to perform CRUD operation in the database
        //JPA provides this methods that has been implemented by ORM, here ORM is Hibernate
        //so this operation are actually written in hibernate
        //Hibernate is an ORM tool used for saving the state of the Java object in the database
    }
}
