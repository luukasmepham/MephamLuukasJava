package com.courseapp.courseapp.services;


import com.courseapp.courseapp.Course;
import com.courseapp.courseapp.Student;
import com.courseapp.courseapp.interfaces.ICourseFileService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseFileService implements ICourseFileService {

    @Override
    public List<String> readStudentsFromFile(String filePath) throws FileNotFoundException {
  
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }
}
