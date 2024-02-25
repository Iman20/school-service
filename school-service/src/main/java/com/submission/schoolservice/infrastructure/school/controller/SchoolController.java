package com.submission.schoolservice.infrastructure.school.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.infrastructure.school.dto.SchoolDto;
import com.submission.schoolservice.usecase.school.CreateSchoolUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    private CreateSchoolUseCase registerSchoolUseCase;

    public SchoolController(CreateSchoolUseCase registerSchoolUseCase) {
        this.registerSchoolUseCase = registerSchoolUseCase;
    }


    @PostMapping("/school")
    public ResponseApi<SchoolDto> save(@RequestBody SchoolDto schoolDto){
        return registerSchoolUseCase.execute(schoolDto);
    }
}
