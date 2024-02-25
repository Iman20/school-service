package com.submission.attendanceservice.infrastructure.attendance.dto;

import com.submission.attendanceservice.util.dto.BaseDto;
import com.submission.attendanceservice.util.enums.AttendanceType;
import lombok.Data;

@Data
public class AttendanceDto extends BaseDto {
    private String studentId;
    private AttendanceType attendance;
}
