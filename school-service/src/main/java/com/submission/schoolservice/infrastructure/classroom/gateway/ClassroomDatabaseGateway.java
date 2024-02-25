package com.submission.schoolservice.infrastructure.classroom.gateway;

import com.submission.schoolservice.domain.classroom.gateway.ClassroomGateway;
import com.submission.schoolservice.infrastructure.config.database.repository.ClassroomRepository;
import com.submission.schoolservice.infrastructure.config.database.schema.Classroom;

import java.util.List;
import java.util.Optional;

public class ClassroomDatabaseGateway implements ClassroomGateway {

    private final ClassroomRepository classroomRepository;

    public ClassroomDatabaseGateway(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom save(Classroom school) {
        return classroomRepository.save(school);
    }

    @Override
    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public Optional<Classroom> findById(String id) {
        return classroomRepository.findById(id);
    }
}
