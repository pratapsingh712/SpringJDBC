package com.raghav.SpringJDBC.repo;

import com.raghav.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void save(Student s) {
        System.out.println("Added...!");
    }
}
