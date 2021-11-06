package com.courseapp.courseapp.controllers;

import java.util.ArrayList;
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
    public List<String> getCourses() {
        return null;
    }

    @GetMapping("/students")
    public List<String> getStudents() {

        List<String> allStudents = new ArrayList<>();
        List<Student> students = courseService.getStudents();

        for (Student a : students) {
            allStudents.add(a.getStudent());
        }

        return allStudents;
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
