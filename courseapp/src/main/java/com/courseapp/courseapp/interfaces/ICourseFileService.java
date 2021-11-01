package com.courseapp.courseapp.interfaces;

import com.courseapp.courseapp.Course;
import com.courseapp.courseapp.Student;

import java.util.List;
import java.io.FileNotFoundException;

public interface ICourseFileService {

    List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException;

    List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException;
    
}
