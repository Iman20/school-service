package com.submission.schoolservice.usecase.school;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.school.gateway.SchoolGateway;
import com.submission.schoolservice.infrastructure.school.dto.SchoolDto;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllSchoolUseCase extends MapperClass {

    private SchoolGateway schoolGateway;

    private ResponseService responseService;

    public FindAllSchoolUseCase(SchoolGateway schoolGateway, ResponseService responseService){
        this.schoolGateway = schoolGateway;
        this.responseService = responseService;
    }

    public ResponseApi<List<SchoolDto>> execute(){
        return responseService.apiSuccess(schoolGateway.findAll()
                .stream()
                .map(this::mapperSchoolEntityToDto)
                .collect(Collectors.toList()));
    }
}
