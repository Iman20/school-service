package com.submission.schoolservice.infrastructure.classroom.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;
import com.submission.schoolservice.usecase.classroom.FindAllClassroomUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllClassroomController {
    private FindAllClassroomUseCase findAllClassroomUseCase;

    public FindAllClassroomController(FindAllClassroomUseCase findAllClassroomUseCase) {
        this.findAllClassroomUseCase = findAllClassroomUseCase;
    }


    @GetMapping("/school/classroom")
    public ResponseApi<List<ClassroomDto>> findAll(){
        return findAllClassroomUseCase.execute();
    }
}
