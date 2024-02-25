package com.submission.schoolservice.infrastructure.school.dto;

import com.submission.schoolservice.util.dto.BaseDto;
import lombok.Data;

@Data
public class SchoolDto extends BaseDto {
    private String name;
    private String status;
}
