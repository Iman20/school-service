package com.submission.schoolservice.domain.student.gateway;

import com.submission.schoolservice.infrastructure.config.database.schema.Student;

import java.util.List;
import java.util.Optional;

public interface StudentGateway {
    Student save(Student student);
    List<Student> findAll();
    Optional<Student> findById(String id);
}
