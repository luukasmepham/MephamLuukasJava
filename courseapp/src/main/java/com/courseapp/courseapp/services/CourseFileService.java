package com.courseapp.courseapp.services;


import com.courseapp.courseapp.interfaces.ICourseFileService;
import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

import java.io.FileNotFoundException;
import java.util.List;

public class CourseFileService implements ICourseFileService {

    @Override
    public List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }
}
