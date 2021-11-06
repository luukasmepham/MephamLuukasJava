package com.courseapp.courseapp.services;

import com.courseapp.courseapp.interfaces.ICourseService;
import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements ICourseService {

    private List<Student> students;

    private List<Course> courses;

    public CourseService() throws FileNotFoundException {

        CourseFileService fileService = new CourseFileService();

        this.courses = fileService.readCoursesFromFile("src/main/java/com/courseapp/courseapp/data/Courses.txt");
        this.students = fileService.readStudentsFromFile("src/main/java/com/courseapp/courseapp/data/Students.txt");

    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Student getStudentById(long studentId) {
        return null;
    }

    @Override
    public Course getCourseById(long courseId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
        // TODO Auto-generated method stub
        return null;
    }


}
