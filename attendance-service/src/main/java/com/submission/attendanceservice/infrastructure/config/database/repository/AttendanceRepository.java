package com.submission.attendanceservice.infrastructure.config.database.repository;

import com.submission.attendanceservice.infrastructure.config.database.schema.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, String> {
}
