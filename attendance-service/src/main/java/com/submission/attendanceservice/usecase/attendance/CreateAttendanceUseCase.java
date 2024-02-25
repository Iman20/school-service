package com.submission.attendanceservice.usecase.attendance;

import com.submission.attendanceservice.domain.attendance.exception.AttendanceNotFoundException;
import com.submission.attendanceservice.domain.attendance.gateway.AttendanceGateway;
import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.infrastructure.attendance.dto.StudentDto;
import com.submission.attendanceservice.util.handler.ResponseApi;
import com.submission.attendanceservice.util.handler.ResponseService;
import com.submission.attendanceservice.util.mapper.MapperClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

public class CreateAttendanceUseCase extends MapperClass {

    private AttendanceGateway attendanceGateway;

    private ResponseService responseService;

    @Autowired
    private RestTemplate restTemplate;

    public CreateAttendanceUseCase(AttendanceGateway attendanceGateway, ResponseService responseService){
        this.attendanceGateway = attendanceGateway;
        this.responseService = responseService;
    }

    public ResponseApi<AttendanceDto> execute(AttendanceDto dto){
        return responseService.apiSuccess(mapperAttendanceEntityToDto(this.attendanceGateway.save(mapperAttendanceDtoToEntity(dto))));
    }
}
