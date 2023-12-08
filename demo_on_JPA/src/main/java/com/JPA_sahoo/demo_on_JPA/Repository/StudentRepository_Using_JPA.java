package com.JPA_sahoo.demo_on_JPA.Repository;

import com.JPA_sahoo.demo_on_JPA.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository_Using_JPA extends JpaRepository<Student, Integer> {

}
