package com.submission.schoolservice.infrastructure.school.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.infrastructure.school.dto.SchoolDto;
import com.submission.schoolservice.usecase.school.FindAllSchoolUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllSchoolController {
    private FindAllSchoolUseCase findAllSchoolUseCase;

    public FindAllSchoolController(FindAllSchoolUseCase findAllSchoolUseCase) {
        this.findAllSchoolUseCase = findAllSchoolUseCase;
    }


    @GetMapping("/school")
    public ResponseApi<List<SchoolDto>> findAll(){
        return findAllSchoolUseCase.execute();
    }
}
