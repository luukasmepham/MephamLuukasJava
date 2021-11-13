package com.courseapp.courseapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;
import com.courseapp.courseapp.services.CourseService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class RestAPI {

    @Autowired
    CourseService courseService;
    
    @PostMapping("/add")
    public boolean addStudentToCourse(@RequestBody Map<String, Object> payload) {

        String student = payload.get("sid").toString();
        String course = payload.get("cid").toString();

        long sid = Long.parseLong(student);
        long cid = Long.parseLong(course);

		return courseService.addStudentToCourse(sid, cid);
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
    public Course getCourseById(@PathVariable(value = "id") long courseId) {
        return courseService.getCourseById(courseId);
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable(value = "id") long studentId) {
        return courseService.getStudentById(studentId);
    }
}
