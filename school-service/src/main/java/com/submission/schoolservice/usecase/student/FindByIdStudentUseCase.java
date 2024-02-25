package com.submission.schoolservice.usecase.student;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.student.exception.StudentNotFoundException;
import com.submission.schoolservice.domain.student.gateway.StudentGateway;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;


public class FindByIdStudentUseCase extends MapperClass {

    private StudentGateway studentGateway;

    private ResponseService responseService;

    public FindByIdStudentUseCase(StudentGateway studentGateway, ResponseService responseService){
        this.studentGateway = studentGateway;
        this.responseService = responseService;
    }

    public ResponseApi<StudentDto> execute(String id) throws StudentNotFoundException {
        return responseService.apiSuccess(mapperStudentEntityToDto(studentGateway.findById(id).orElseThrow(StudentNotFoundException::new)));
    }
}
