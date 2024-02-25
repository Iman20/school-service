package com.submission.attendanceservice.domain.attendance.gateway;


import com.submission.attendanceservice.infrastructure.config.database.schema.Attendance;

import java.util.List;
import java.util.Optional;

public interface AttendanceGateway {
    Attendance save(Attendance attendance);
    List<Attendance> findAll();
    Optional<Attendance> findById(String id);
}
