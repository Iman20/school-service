package com.submission.schoolservice.usecase.student;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.student.gateway.StudentGateway;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllStudentUseCase extends MapperClass {

    private StudentGateway studentGateway;

    private ResponseService responseService;

    public FindAllStudentUseCase(StudentGateway studentGateway, ResponseService responseService){
        this.studentGateway = studentGateway;
        this.responseService = responseService;
    }


    public ResponseApi<List<StudentDto>> execute(){
        return responseService.apiSuccess(studentGateway.findAll()
                .stream()
                .map(this::mapperStudentEntityToDto)
                .collect(Collectors.toList()));
    }
}
