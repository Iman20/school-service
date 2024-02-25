package com.submission.schoolservice.infrastructure.classroom.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.domain.classroom.exception.ClassroomNotFoundException;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;
import com.submission.schoolservice.usecase.classroom.FindByIdClassroomUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindByIdClassroomController {
    private FindByIdClassroomUseCase findByIdClassroomUseCase;

    public FindByIdClassroomController(FindByIdClassroomUseCase findByIdClassroomUseCase) {
        this.findByIdClassroomUseCase = findByIdClassroomUseCase;
    }


    @GetMapping("/school/classroom/{id}")
    public ResponseApi<ClassroomDto> findById(@PathVariable String id) throws ClassroomNotFoundException {
        return findByIdClassroomUseCase.execute(id);
    }
}
