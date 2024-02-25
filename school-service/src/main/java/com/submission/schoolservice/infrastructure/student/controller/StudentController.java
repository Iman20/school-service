package com.submission.schoolservice.infrastructure.student.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;
import com.submission.schoolservice.usecase.student.CreateStudentUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private CreateStudentUseCase registerStudentUseCase;

    public StudentController(CreateStudentUseCase registerStudentUseCase) {
        this.registerStudentUseCase = registerStudentUseCase;
    }


    @PostMapping("/school/student")
    public ResponseApi<StudentDto> save(@RequestBody StudentDto StudentDto){
        return registerStudentUseCase.execute(StudentDto);
    }
}
