package com.submission.attendanceservice.infrastructure.attendance.controller;

import com.submission.attendanceservice.domain.attendance.exception.AttendanceNotFoundException;
import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.usecase.attendance.FindByIdAttendanceUseCase;
import com.submission.attendanceservice.util.handler.ResponseApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindByIdAttendanceController {
    private FindByIdAttendanceUseCase findByIdAttendanceUseCase;

    public FindByIdAttendanceController(FindByIdAttendanceUseCase findByIdAttendanceUseCase) {
        this.findByIdAttendanceUseCase = findByIdAttendanceUseCase;
    }


    @GetMapping("/attendance/{id}")
    public ResponseApi<AttendanceDto> findById(@PathVariable String id) throws AttendanceNotFoundException {
        return findByIdAttendanceUseCase.execute(id);
    }
}
