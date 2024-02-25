package com.submission.schoolservice.domain.school.gateway;


import com.submission.schoolservice.infrastructure.config.database.schema.School;

import java.util.List;
import java.util.Optional;

public interface SchoolGateway {
    School save(School school);
    List<School> findAll();
    Optional<School> findById(String id);
}
