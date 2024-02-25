package com.submission.attendanceservice.infrastructure.attendance.gateway;

import com.submission.attendanceservice.domain.attendance.gateway.AttendanceGateway;
import com.submission.attendanceservice.infrastructure.config.database.repository.AttendanceRepository;
import com.submission.attendanceservice.infrastructure.config.database.schema.Attendance;

import java.util.List;
import java.util.Optional;

public class AttendanceDatabaseGateway implements AttendanceGateway {

    private final AttendanceRepository attendanceRepository;

    public AttendanceDatabaseGateway(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public Attendance save(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> findAll() {
        return attendanceRepository.findAll();
    }

    @Override
    public Optional<Attendance> findById(String id) {
        return attendanceRepository.findById(id);
    }
}
