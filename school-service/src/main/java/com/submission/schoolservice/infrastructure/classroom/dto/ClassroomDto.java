package com.submission.schoolservice.infrastructure.classroom.dto;

import com.submission.schoolservice.util.dto.BaseDto;
import lombok.Data;

@Data
public class ClassroomDto extends BaseDto {
    private String name;
    private String status;
    private String schoolId;
}
