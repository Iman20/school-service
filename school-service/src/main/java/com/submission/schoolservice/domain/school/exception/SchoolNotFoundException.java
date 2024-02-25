package com.submission.schoolservice.domain.school.exception;

public class SchoolNotFoundException extends Exception{
    public SchoolNotFoundException(){
        super("School is not found");
    }
}
