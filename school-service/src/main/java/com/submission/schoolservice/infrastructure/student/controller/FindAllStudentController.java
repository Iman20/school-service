package com.submission.schoolservice.infrastructure.student.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;
import com.submission.schoolservice.usecase.student.FindAllStudentUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllStudentController {
    private FindAllStudentUseCase findAllStudentUseCase;

    public FindAllStudentController(FindAllStudentUseCase findAllStudentUseCase) {
        this.findAllStudentUseCase = findAllStudentUseCase;
    }


    @GetMapping("/school/student")
    public ResponseApi<List<StudentDto>> findAll(){
        return findAllStudentUseCase.execute();
    }
}
