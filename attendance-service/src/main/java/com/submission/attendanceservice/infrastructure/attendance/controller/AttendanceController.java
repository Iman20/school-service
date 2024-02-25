package com.submission.attendanceservice.infrastructure.attendance.controller;

import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.usecase.attendance.CreateAttendanceUseCase;
import com.submission.attendanceservice.util.handler.ResponseApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {

    private CreateAttendanceUseCase registerAttendanceUseCase;

    public AttendanceController(CreateAttendanceUseCase registerAttendanceUseCase) {
        this.registerAttendanceUseCase = registerAttendanceUseCase;
    }

    @PostMapping("/attendance")
    public ResponseApi<AttendanceDto> save(@RequestBody AttendanceDto attendanceDto) {
        return registerAttendanceUseCase.execute(attendanceDto);
    }
}
