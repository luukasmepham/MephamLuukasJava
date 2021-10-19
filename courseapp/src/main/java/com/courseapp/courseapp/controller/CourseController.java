package com.courseapp.courseapp.controller;


import com.courseapp.courseapp.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @PostMapping("/course")
    public String postCourse(@RequestBody String courseName) {
		Course.courseWrite(courseName);
        return courseName;
    }
}
