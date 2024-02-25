package com.submission.schoolservice.domain.classroom.exception;

public class ClassroomNotFoundException extends Exception{
    public ClassroomNotFoundException(){
        super("Classroom is not found");
    }
}
