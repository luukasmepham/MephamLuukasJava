package com.courseapp.courseapp.controller;


import com.courseapp.courseapp.model.Course;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CourseController {

    @PostMapping("/course")
    public String postCourse(@RequestBody String courseName) {
		Course.courseWrite(courseName);
        return courseName;
    }

    @GetMapping("/course/{id}")
    public String getCourse(@PathVariable(value = "id") int courseId) {
        return Course.courseRead(courseId);
    }
}
