package com.courseapp.courseapp.services;


import com.courseapp.courseapp.interfaces.ICourseFileService;

import com.courseapp.courseapp.models.Course;
import com.courseapp.courseapp.models.Student;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CourseFileService implements ICourseFileService {

    @Override
    public List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException {

    List<Student> students = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {

                String name = scanner.nextLine();
                Student student = new Student(name);
                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    return students;
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {

    List<Course> courses = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {

                String name = scanner.nextLine();
                Course course = new Course(name);
                courses.add(course);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    return courses;
    }
}
