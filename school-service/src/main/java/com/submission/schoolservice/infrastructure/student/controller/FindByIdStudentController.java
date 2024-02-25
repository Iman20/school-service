package com.submission.schoolservice.infrastructure.student.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.domain.student.exception.StudentNotFoundException;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;
import com.submission.schoolservice.usecase.student.FindByIdStudentUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindByIdStudentController {
    private FindByIdStudentUseCase findByIdStudentUseCase;

    public FindByIdStudentController(FindByIdStudentUseCase findByIdStudentUseCase) {
        this.findByIdStudentUseCase = findByIdStudentUseCase;
    }


    @GetMapping("/school/student/{id}")
    public ResponseApi<StudentDto> findById(@PathVariable String id) throws StudentNotFoundException {
        return findByIdStudentUseCase.execute(id);
    }
}
