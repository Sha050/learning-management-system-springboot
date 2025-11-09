package com.example.learningManagementSystem.service;

import com.example.learningManagementSystem.dto.CourseDto;
import com.example.learningManagementSystem.dto.StudentProfileDto;
import com.example.learningManagementSystem.exception.EmailAlreadyExistsException;
import com.example.learningManagementSystem.exception.StudentNotFoundException;
import com.example.learningManagementSystem.model.Course;
import com.example.learningManagementSystem.model.Student;
import com.example.learningManagementSystem.model.StudentProfile;
import com.example.learningManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository rep;

    public Student addStudent(Student s) {
        if(rep.existsByEmail(s.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists: " + s.getEmail());
        }
        return rep.save(s);
    }

    public Student addProfileToStudent(StudentProfileDto s, long id) {
        Student ss = rep.findById(id).orElseThrow(()-> new StudentNotFoundException("Student does not exists :("));
        StudentProfile sp = new StudentProfile();
        sp.setAddress(s.getAddress());
        sp.setPhoneNumber(s.getPhoneNumber());
        ss.setProfile(sp);
        return rep.save(ss);
    }

    public Student addCourseToStudent(CourseDto dto, long id) {
        Student student = rep.findById(id).orElseThrow(()-> new StudentNotFoundException("Student does not exists :("));
        Course course = new Course();
        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setStudent(student);

        student.getCourses().add(course);

        return rep.save(student);
    }
}
