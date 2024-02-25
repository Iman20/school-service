package com.submission.schoolservice.infrastructure.school.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.domain.school.exception.SchoolNotFoundException;
import com.submission.schoolservice.infrastructure.school.dto.SchoolDto;
import com.submission.schoolservice.usecase.school.FindByIdSchoolUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindByIdSchoolController {
    private FindByIdSchoolUseCase findByIdSchoolUseCase;

    public FindByIdSchoolController(FindByIdSchoolUseCase findByIdSchoolUseCase) {
        this.findByIdSchoolUseCase = findByIdSchoolUseCase;
    }


    @GetMapping("/school/{id}")
    public ResponseApi<SchoolDto> findById(@PathVariable String id) throws SchoolNotFoundException {
        return findByIdSchoolUseCase.execute(id);
    }
}
