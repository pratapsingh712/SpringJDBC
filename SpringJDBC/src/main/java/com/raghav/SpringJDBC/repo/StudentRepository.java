package com.raghav.SpringJDBC.repo;

import com.raghav.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student s) {
        System.out.println("Added...!");
    }

    public List<Student> findAll() {
        return new ArrayList<>(); // right now we do not have any data that's why returning null
    }
}
