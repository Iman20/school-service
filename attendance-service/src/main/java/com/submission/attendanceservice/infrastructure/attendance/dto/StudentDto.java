package com.submission.attendanceservice.infrastructure.attendance.dto;

import com.submission.attendanceservice.util.dto.BaseDto;
import lombok.Data;

@Data
public class StudentDto extends BaseDto {
    private String name;
    private String status;
    private String classroomId;
}
