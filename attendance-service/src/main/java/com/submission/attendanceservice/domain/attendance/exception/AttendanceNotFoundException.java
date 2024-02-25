package com.submission.attendanceservice.domain.attendance.exception;

public class AttendanceNotFoundException extends Exception{
    public AttendanceNotFoundException(){
        super("Attendance is not found");
    }
}
