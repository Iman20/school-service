package com.submission.schoolservice.usecase.student;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.student.gateway.StudentGateway;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;

public class CreateStudentUseCase extends MapperClass {

    private StudentGateway studentGateway;

    private ResponseService responseService;

    public CreateStudentUseCase(StudentGateway studentGateway, ResponseService responseService){
        this.studentGateway = studentGateway;
        this.responseService = responseService;
    }

    public ResponseApi<StudentDto> execute(StudentDto dto){
        return responseService.apiSuccess(mapperStudentEntityToDto(this.studentGateway.save(mapperStudentDtoToEntity(dto))));
    }
}
