package com.submission.schoolservice.infrastructure.student.dto;

import com.submission.schoolservice.util.dto.BaseDto;
import lombok.Data;

@Data
public class StudentDto extends BaseDto {
    private String name;
    private String status;
    private String classroomId;
}
