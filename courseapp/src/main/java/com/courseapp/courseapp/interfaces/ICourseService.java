package com.courseapp.courseapp.interfaces;

import java.util.List;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

public interface ICourseService {

    boolean addStudentToCourse(long studentId, long courseId);

    List<Student> getStudents();
    List<Course> getCourses();

    Student getStudentById(long studentId);
    Course getCourseById(long courseId);

    List<Course> getCoursesOfStudent(long studentId);

}
