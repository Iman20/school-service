package com.submission.schoolservice.infrastructure.config.database.repository;

import com.submission.schoolservice.infrastructure.config.database.schema.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, String> {
}
