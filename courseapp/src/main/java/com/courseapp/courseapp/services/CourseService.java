package com.courseapp.courseapp.services;

import com.courseapp.courseapp.interfaces.ICourseService;
import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

import java.util.List;

public class CourseService implements ICourseService {

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Course> getCourses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student getStudentById(long studentId) {
        // TODO Auto-generated method stub
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
