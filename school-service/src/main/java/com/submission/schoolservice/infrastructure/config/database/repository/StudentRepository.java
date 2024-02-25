package com.submission.schoolservice.infrastructure.config.database.repository;

import com.submission.schoolservice.infrastructure.config.database.schema.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
