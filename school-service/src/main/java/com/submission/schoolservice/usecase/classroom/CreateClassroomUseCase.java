package com.submission.schoolservice.usecase.classroom;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.classroom.gateway.ClassroomGateway;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;

public class CreateClassroomUseCase extends MapperClass {

    private ClassroomGateway classroomGateway;

    private ResponseService responseService;

    public CreateClassroomUseCase(ClassroomGateway classroomGateway, ResponseService responseService){
        this.classroomGateway = classroomGateway;
        this.responseService = responseService;
    }

    public ResponseApi<ClassroomDto> execute(ClassroomDto dto){
        return responseService.apiSuccess(mapperClassroomEntityToDto(this.classroomGateway.save(mapperClassroomDtoToEntity(dto))));
    }
}
