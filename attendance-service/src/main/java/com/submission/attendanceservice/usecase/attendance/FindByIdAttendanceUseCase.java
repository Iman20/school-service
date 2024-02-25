package com.submission.attendanceservice.usecase.attendance;

import com.submission.attendanceservice.domain.attendance.exception.AttendanceNotFoundException;
import com.submission.attendanceservice.domain.attendance.gateway.AttendanceGateway;
import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.util.handler.ResponseApi;
import com.submission.attendanceservice.util.handler.ResponseService;
import com.submission.attendanceservice.util.mapper.MapperClass;


public class FindByIdAttendanceUseCase extends MapperClass {

    private AttendanceGateway attendanceGateway;

    private ResponseService responseService;

    public FindByIdAttendanceUseCase(AttendanceGateway attendanceGateway, ResponseService responseService){
        this.attendanceGateway = attendanceGateway;
        this.responseService = responseService;
    }

    public ResponseApi<AttendanceDto> execute(String id) throws AttendanceNotFoundException {
        return responseService.apiSuccess(mapperAttendanceEntityToDto(attendanceGateway.findById(id).orElseThrow(AttendanceNotFoundException::new)));
    }
}
