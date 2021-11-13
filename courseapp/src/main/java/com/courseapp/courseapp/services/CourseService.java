package com.courseapp.courseapp.services;

import com.courseapp.courseapp.interfaces.ICourseService;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
        return getCourseById(courseId).setStudent(getStudentById(studentId));
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
        for (Student student : students) {
            if (student.getId() == studentId) {
              return student;
            }
          }
          throw new NoSuchElementException();
    }

    @Override
    public Course getCourseById(long courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
              return course;
            }
          }
          throw new NoSuchElementException();
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {

        List<Course> studentsCourses = new ArrayList<>(); 
            for (int i = 1; i <= courses.size(); i++) {
                Course courseInCheck = getCourseById(Long.valueOf(i));
                boolean isInCourse = courseInCheck.getStudent(getStudentById(studentId));
                if (isInCourse == true) {
                    studentsCourses.add(getCourseById(Long.valueOf(i)));
                }
            }
        return studentsCourses;
    }
}
