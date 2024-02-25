package com.submission.schoolservice.usecase.classroom;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.classroom.gateway.ClassroomGateway;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllClassroomUseCase extends MapperClass {

    private ClassroomGateway classroomGateway;

    private ResponseService responseService;

    public FindAllClassroomUseCase(ClassroomGateway classroomGateway, ResponseService responseService){
        this.classroomGateway = classroomGateway;
        this.responseService = responseService;
    }


    public ResponseApi<List<ClassroomDto>> execute(){
        return responseService.apiSuccess(classroomGateway.findAll()
                .stream()
                .map(this::mapperClassroomEntityToDto)
                .collect(Collectors.toList()));
    }
}
