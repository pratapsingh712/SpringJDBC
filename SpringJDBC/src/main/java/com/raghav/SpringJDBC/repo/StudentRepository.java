package com.raghav.SpringJDBC.repo;

import com.raghav.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String sql = "insert into student(rollno, name, marks) values (?, ?, ?)";

        int rowsAffected = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());

        System.out.println(rowsAffected+"Rows.......Effected ");
    }

    public List<Student> findAll() {
        return new ArrayList<>(); // right now we do not have any data that's why returning null
    }
}
