package com.submission.schoolservice.infrastructure.config.database.repository;

import com.submission.schoolservice.infrastructure.config.database.schema.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, String> {
}
