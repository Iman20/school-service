package com.submission.schoolservice.util.mapper;

import com.submission.schoolservice.infrastructure.config.database.schema.School;
import com.submission.schoolservice.infrastructure.classroom.dto.ClassroomDto;
import com.submission.schoolservice.infrastructure.student.dto.StudentDto;
import com.submission.schoolservice.infrastructure.config.database.schema.Classroom;
import com.submission.schoolservice.infrastructure.config.database.schema.Student;
import com.submission.schoolservice.infrastructure.school.dto.SchoolDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

public class MapperClass {

    @Autowired
    ModelMapper modelMapper;

    public SchoolDto mapperSchoolEntityToDto(School school){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        SchoolDto schoolDto = new SchoolDto();
        schoolDto = modelMapper.map(school, SchoolDto.class);
        return schoolDto;
    }

    public School mapperSchoolDtoToEntity(SchoolDto schoolDto){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        School school = new School();
        school = modelMapper.map(schoolDto, School.class);
        return school;
    }

    public StudentDto mapperStudentEntityToDto(Student student){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        StudentDto studentDto = new StudentDto();
        studentDto = modelMapper.map(student, StudentDto.class);
        return studentDto;
    }

    public Student mapperStudentDtoToEntity(StudentDto studentDto){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Student student = new Student();
        student = modelMapper.map(studentDto, Student.class);
        return student;
    }

    public ClassroomDto mapperClassroomEntityToDto(Classroom classroom){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ClassroomDto classroomDto = new ClassroomDto();
        classroomDto = modelMapper.map(classroom, ClassroomDto.class);
        return classroomDto;
    }

    public Classroom mapperClassroomDtoToEntity(ClassroomDto classroomDto){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Classroom classroom = new Classroom();
        classroom = modelMapper.map(classroomDto, Classroom.class);
        return classroom;
    }

}
