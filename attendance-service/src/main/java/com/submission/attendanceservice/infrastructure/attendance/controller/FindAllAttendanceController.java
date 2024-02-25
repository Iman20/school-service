package com.submission.attendanceservice.infrastructure.attendance.controller;

import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.usecase.attendance.FindAllAttendanceUseCase;
import com.submission.attendanceservice.util.handler.ResponseApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllAttendanceController {
    private FindAllAttendanceUseCase findAllAttendanceUseCase;

    public FindAllAttendanceController(FindAllAttendanceUseCase findAllAttendanceUseCase) {
        this.findAllAttendanceUseCase = findAllAttendanceUseCase;
    }


    @GetMapping("/attendance")
    public ResponseApi<List<AttendanceDto>> findAll(){
        return findAllAttendanceUseCase.execute();
    }
}
