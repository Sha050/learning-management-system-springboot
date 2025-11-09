package com.example.learningManagementSystem.controller;

import com.example.learningManagementSystem.dto.CourseDto;
import com.example.learningManagementSystem.dto.StudentProfileDto;
import com.example.learningManagementSystem.model.Student;
import com.example.learningManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping
    public Student createStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @PutMapping("/{id}/profile")
    public Student addProfile(@RequestBody StudentProfileDto spDto, @PathVariable long id) {
        return service.addProfileToStudent(spDto, id);
    }

    @PutMapping("/{id}/course")
    public Student addCourse(@RequestBody CourseDto dto, @PathVariable long id) {
        return service.addCourseToStudent(dto,id);
    }
}
