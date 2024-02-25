package com.submission.schoolservice.usecase.school;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.util.handler.ResponseService;
import com.submission.schoolservice.util.mapper.MapperClass;
import com.submission.schoolservice.domain.school.exception.SchoolNotFoundException;
import com.submission.schoolservice.domain.school.gateway.SchoolGateway;
import com.submission.schoolservice.infrastructure.school.dto.SchoolDto;

public class FindByIdSchoolUseCase extends MapperClass {
    private SchoolGateway schoolGateway;

    private ResponseService responseService;

    public FindByIdSchoolUseCase(SchoolGateway schoolGateway, ResponseService responseService){
        this.schoolGateway = schoolGateway;
        this.responseService = responseService;
    }

    public ResponseApi<SchoolDto> execute(String id) throws SchoolNotFoundException {
        return responseService.apiSuccess(mapperSchoolEntityToDto(schoolGateway.findById(id).orElseThrow(SchoolNotFoundException::new)));
    }
}
