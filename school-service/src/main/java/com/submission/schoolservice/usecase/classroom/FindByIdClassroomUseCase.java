package com.submission.schoolservice.usecase.classroom;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.classroom.exception.ClassroomNotFoundException;
import com.submission.schoolservice.domain.classroom.gateway.ClassroomGateway;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;


public class FindByIdClassroomUseCase extends MapperClass {


    private ClassroomGateway classroomGateway;

    private ResponseService responseService;

    public FindByIdClassroomUseCase(ClassroomGateway classroomGateway, ResponseService responseService){
        this.classroomGateway = classroomGateway;
        this.responseService = responseService;
    }

    public ResponseApi<ClassroomDto> execute(String id) throws ClassroomNotFoundException {
        return responseService.apiSuccess(mapperClassroomEntityToDto(classroomGateway.findById(id).orElseThrow(ClassroomNotFoundException::new)));
    }
}
