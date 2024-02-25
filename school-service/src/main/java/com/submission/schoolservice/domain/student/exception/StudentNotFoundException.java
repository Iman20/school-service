package com.submission.schoolservice.domain.student.exception;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super("Student is not found");
    }
}
