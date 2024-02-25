package com.submission.schoolservice.infrastructure.school.gateway;

import com.submission.schoolservice.infrastructure.config.database.repository.SchoolRepository;
import com.submission.schoolservice.infrastructure.config.database.schema.School;
import com.submission.schoolservice.domain.school.gateway.SchoolGateway;

import java.util.List;
import java.util.Optional;

public class SchoolDatabaseGateway implements SchoolGateway {

    private final SchoolRepository schoolRepository;

    public SchoolDatabaseGateway(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School save(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public Optional<School> findById(String id) {
        return schoolRepository.findById(id);
    }
}
