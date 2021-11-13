package com.courseapp.courseapp.controllers;

import java.util.List;
import java.util.Map;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;
import com.courseapp.courseapp.services.CourseService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.http.MediaType;

@RestController
public class RestAPI {

    @Autowired
    CourseService courseService;
    
    @PostMapping("/add")
    public boolean addStudentToCourse(@RequestBody Map<String, Object> payload) {
        long sid = Long.parseLong(payload.get("sid").toString());
        long cid = Long.parseLong(payload.get("cid").toString());
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

    @GetMapping(path = "/courses/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public String getCourseById(@PathVariable(value = "id") long courseId) {

        String course = courseService.getCourseById(courseId).courseName();
        String students = "";

        List<String> listOfStudents = courseService.getCourseById(courseId).studentNames();
            for (String student : listOfStudents) {students += "<p>" + student + "</p>\n";}

        return "<html>\n" + 
        "<header><title></title></header>\n" + 
        "<body>\n" + "<h2>" + course + "</h2>\n" + students + "</body>\n" + "</html>";
    }

    @GetMapping(path = "/students/{id}", produces = MediaType.TEXT_HTML_VALUE)
    public String getStudentById(@PathVariable(value = "id") long studentId) {

        String student = courseService.getStudentById(studentId).studentName();
        String courses = "";

        List<Course> listOfCourses = courseService.getCoursesOfStudent(studentId);
            for (Course course : listOfCourses) {courses += "<p>" + course.courseName() + "</p>\n";}

        return "<html>\n" + "<header><title></title></header>\n" + "<body>\n" + "<h2>" + student + "</h2>\n"  + courses + "</body>\n" + "</html>";
    }
}
