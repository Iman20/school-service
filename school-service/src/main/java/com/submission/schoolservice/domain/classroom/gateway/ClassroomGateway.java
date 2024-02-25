package com.submission.schoolservice.domain.classroom.gateway;


import com.submission.schoolservice.infrastructure.config.database.schema.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomGateway {
    Classroom save(Classroom classroom);
    List<Classroom> findAll();
    Optional<Classroom> findById(String id);
}
