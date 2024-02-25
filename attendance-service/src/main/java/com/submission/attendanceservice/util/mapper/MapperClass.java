package com.submission.attendanceservice.util.mapper;

import com.submission.attendanceservice.infrastructure.attendance.dto.AttendanceDto;
import com.submission.attendanceservice.infrastructure.config.database.schema.Attendance;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

public class MapperClass {

    @Autowired
    ModelMapper modelMapper;

    public AttendanceDto mapperAttendanceEntityToDto(Attendance attendance){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        AttendanceDto attendanceDto = new AttendanceDto();
        attendanceDto = modelMapper.map(attendance, AttendanceDto.class);
        return attendanceDto;
    }

    public Attendance mapperAttendanceDtoToEntity(AttendanceDto attendanceDto){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Attendance attendance = new Attendance();
        attendance = modelMapper.map(attendanceDto, Attendance.class);
        return attendance;
    }
}
