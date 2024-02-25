package com.submission.attendanceservice.usecase.attendance;

import com.submission.attendanceservice.domain.attendance.gateway.AttendanceGateway;
import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.util.handler.ResponseApi;
import com.submission.attendanceservice.util.handler.ResponseService;
import com.submission.attendanceservice.util.mapper.MapperClass;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllAttendanceUseCase extends MapperClass {

    private AttendanceGateway attendanceGateway;

    private ResponseService responseService;

    public FindAllAttendanceUseCase(AttendanceGateway attendanceGateway, ResponseService responseService){
        this.attendanceGateway = attendanceGateway;
        this.responseService = responseService;
    }


    public ResponseApi<List<AttendanceDto>> execute(){
        return responseService.apiSuccess(attendanceGateway.findAll()
                .stream()
                .map(this::mapperAttendanceEntityToDto)
                .collect(Collectors.toList()));
    }
}
