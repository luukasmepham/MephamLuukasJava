package com.courseapp.courseapp.api;

import com.courseapp.courseapp.services.CourseService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class RestAPI {
    
    @PostMapping("/add")
    public String addStudentToCourse(@RequestBody int sid, int cid) {
		CourseService.addStudentToCourse(sid, cid);
    }

    @GetMapping("/courses")
    public String getCourses(@PathVariable(value = "id") int courseId) {
        return CourseService.getCourses(courseId);
    }

    @GetMapping("/students")
    public String getStudents(@PathVariable(value = "id") int studentId) {
        return CourseService.getStudents(studentId);
    }

    @GetMapping("/courses/{id}")
    public String getCourseById(@PathVariable(value = "id") int courseId) {
        return CourseService.getCourseById(courseId);
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable(value = "id") int studentId) {
        return CourseService.getStudentById(studentId);
    }
}
