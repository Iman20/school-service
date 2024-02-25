package com.submission.schoolservice.infrastructure.config.rest;

import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.infrastructure.classroom.gateway.ClassroomDatabaseGateway;
import com.submission.schoolservice.infrastructure.config.database.repository.ClassroomRepository;
import com.submission.schoolservice.infrastructure.config.database.repository.SchoolRepository;
import com.submission.schoolservice.infrastructure.config.database.repository.StudentRepository;
import com.submission.schoolservice.infrastructure.school.gateway.SchoolDatabaseGateway;
import com.submission.schoolservice.infrastructure.student.gateway.StudentDatabaseGateway;
import com.submission.schoolservice.usecase.classroom.FindAllClassroomUseCase;
import com.submission.schoolservice.usecase.classroom.FindByIdClassroomUseCase;
import com.submission.schoolservice.usecase.classroom.CreateClassroomUseCase;
import com.submission.schoolservice.usecase.school.FindAllSchoolUseCase;
import com.submission.schoolservice.usecase.school.FindByIdSchoolUseCase;
import com.submission.schoolservice.usecase.school.CreateSchoolUseCase;
import com.submission.schoolservice.usecase.student.FindAllStudentUseCase;
import com.submission.schoolservice.usecase.student.FindByIdStudentUseCase;
import com.submission.schoolservice.usecase.student.CreateStudentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig {

    @Autowired
    private ResponseService responseService;

    @Bean
    public CreateSchoolUseCase registerSchoolUseCase(SchoolRepository schoolRepository) {
        SchoolDatabaseGateway schoolDatabaseGateway = new SchoolDatabaseGateway(schoolRepository);
        return new CreateSchoolUseCase(schoolDatabaseGateway, responseService);
    }

    @Bean
    public FindAllSchoolUseCase findAllSchoolUseCase(SchoolRepository schoolRepository) {
        SchoolDatabaseGateway schoolDatabaseGateway = new SchoolDatabaseGateway(schoolRepository);
        return new FindAllSchoolUseCase(schoolDatabaseGateway, responseService);
    }

    @Bean
    public FindByIdSchoolUseCase findByIdSchoolUseCase(SchoolRepository schoolRepository) {
        SchoolDatabaseGateway schoolDatabaseGateway = new SchoolDatabaseGateway(schoolRepository);
        return new FindByIdSchoolUseCase(schoolDatabaseGateway, responseService);
    }

    @Bean
    public CreateStudentUseCase registerStudentUseCase(StudentRepository studentRepository) {
        StudentDatabaseGateway studentDatabaseGateway = new StudentDatabaseGateway(studentRepository);
        return new CreateStudentUseCase(studentDatabaseGateway, responseService);
    }

    @Bean
    public FindAllStudentUseCase findAllStudentUseCase(StudentRepository studentRepository) {
        StudentDatabaseGateway studentDatabaseGateway = new StudentDatabaseGateway(studentRepository);
        return new FindAllStudentUseCase(studentDatabaseGateway, responseService);
    }

    @Bean
    public FindByIdStudentUseCase findByIdStudentUseCase(StudentRepository studentRepository) {
        StudentDatabaseGateway studentDatabaseGateway = new StudentDatabaseGateway(studentRepository);
        return new FindByIdStudentUseCase(studentDatabaseGateway, responseService);
    }


    @Bean
    public CreateClassroomUseCase registerClassroomUseCase(ClassroomRepository classroomRepository) {
        ClassroomDatabaseGateway classroomDatabaseGateway = new ClassroomDatabaseGateway(classroomRepository);
        return new CreateClassroomUseCase(classroomDatabaseGateway, responseService);
    }

    @Bean
    public FindAllClassroomUseCase findAllClassroomUseCase(ClassroomRepository classroomRepository) {
        ClassroomDatabaseGateway classroomDatabaseGateway = new ClassroomDatabaseGateway(classroomRepository);
        return new FindAllClassroomUseCase(classroomDatabaseGateway, responseService);
    }

    @Bean
    public FindByIdClassroomUseCase findByIdClassroomUseCase(ClassroomRepository classroomRepository) {
        ClassroomDatabaseGateway classroomDatabaseGateway = new ClassroomDatabaseGateway(classroomRepository);
        return new FindByIdClassroomUseCase(classroomDatabaseGateway, responseService);
    }

}
