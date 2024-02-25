package com.submission.schoolservice.infrastructure.classroom.controller;

import com.submission.schoolservice.util.handler.ResponseApi;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;
import com.submission.schoolservice.usecase.classroom.CreateClassroomUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassroomController {
    private CreateClassroomUseCase registerClassroomUseCase;

    public ClassroomController(CreateClassroomUseCase registerClassroomUseCase) {
        this.registerClassroomUseCase = registerClassroomUseCase;
    }


    @PostMapping("/school/classroom")
    public ResponseApi<ClassroomDto> save(@RequestBody ClassroomDto classroomDto){
        return registerClassroomUseCase.execute(classroomDto);
    }
}
