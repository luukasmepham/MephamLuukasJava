package com.courseapp.courseapp.interfaces;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

import java.util.List;
import java.io.FileNotFoundException;

public interface ICourseFileService {

    List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException;

    List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException;
    
}
