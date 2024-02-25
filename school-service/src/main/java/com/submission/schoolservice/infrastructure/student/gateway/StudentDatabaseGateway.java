package com.submission.schoolservice.infrastructure.student.gateway;

import com.submission.schoolservice.domain.school.gateway.SchoolGateway;
import com.submission.schoolservice.domain.student.gateway.StudentGateway;
import com.submission.schoolservice.infrastructure.config.database.repository.SchoolRepository;
import com.submission.schoolservice.infrastructure.config.database.repository.StudentRepository;
import com.submission.schoolservice.infrastructure.config.database.schema.School;
import com.submission.schoolservice.infrastructure.config.database.schema.Student;

import java.util.List;
import java.util.Optional;

public class StudentDatabaseGateway implements StudentGateway {

    private final StudentRepository studentRepository;

    public StudentDatabaseGateway(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student school) {
        return studentRepository.save(school);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(String id) {
        return studentRepository.findById(id);
    }
}
