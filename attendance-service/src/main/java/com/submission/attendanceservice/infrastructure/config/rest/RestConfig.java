package com.submission.attendanceservice.infrastructure.config.rest;

import com.submission.attendanceservice.infrastructure.attendance.gateway.AttendanceDatabaseGateway;
import com.submission.attendanceservice.infrastructure.config.database.repository.AttendanceRepository;
import com.submission.attendanceservice.usecase.attendance.CreateAttendanceUseCase;
import com.submission.attendanceservice.usecase.attendance.FindAllAttendanceUseCase;
import com.submission.attendanceservice.usecase.attendance.FindByIdAttendanceUseCase;
import com.submission.attendanceservice.util.handler.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    private ResponseService responseService;

    @Bean
    public CreateAttendanceUseCase registerAttendanceUseCase(AttendanceRepository attendanceRepository) {
        AttendanceDatabaseGateway attendanceDatabaseGateway = new AttendanceDatabaseGateway(attendanceRepository);
        return new CreateAttendanceUseCase(attendanceDatabaseGateway, responseService);
    }

    @Bean
    public FindAllAttendanceUseCase findAllAttendanceUseCase(AttendanceRepository attendanceRepository) {
        AttendanceDatabaseGateway attendanceDatabaseGateway = new AttendanceDatabaseGateway(attendanceRepository);
        return new FindAllAttendanceUseCase(attendanceDatabaseGateway, responseService);
    }

    @Bean
    public FindByIdAttendanceUseCase findByIdAttendanceUseCase(AttendanceRepository attendanceRepository) {
        AttendanceDatabaseGateway attendanceDatabaseGateway = new AttendanceDatabaseGateway(attendanceRepository);
        return new FindByIdAttendanceUseCase(attendanceDatabaseGateway, responseService);
    }
}
