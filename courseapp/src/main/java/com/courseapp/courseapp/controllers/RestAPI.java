package com.courseapp.courseapp.controllers;

import java.util.List;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;
import com.courseapp.courseapp.services.CourseService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class RestAPI {

    @Autowired
    CourseService courseService;
    
    @PostMapping("/add")
    public String addStudentToCourse(@RequestBody long sid, long cid) {
		courseService.addStudentToCourse(sid, cid);
        return null;
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return courseService.getStudents();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable(value = "id") int courseId) {
        return courseService.getCourseById(courseId);
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable(value = "id") int studentId) {
        return courseService.getStudentById(studentId);
    }
}
