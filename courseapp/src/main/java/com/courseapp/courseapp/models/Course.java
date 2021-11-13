package com.courseapp.courseapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Course {

    private static AtomicInteger count = new AtomicInteger(0); 

    private long courseId;
    private String course_name;
    private String teacher_name;
    private String location;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {

        this.courseId = count.incrementAndGet(); 

        String[] names = name.split("@");
        String course_name = names[0];
        String teacher_name = names[1];
        String location = names[2];

        this.course_name = course_name;
        this.teacher_name = teacher_name;
        this.location = location;
    }

    public String courseName() {
        return course_name;
    }

    public long getId() {
        return this.courseId;
    }

    public String getCourse() {
        return this.course_name;
    }

    public String getTeacher() {
        return this.teacher_name;
    }

    public String getLocation() {
        return this.location;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean setStudent(Student student) {
        if (students.size() <= 25) {
            students.add(student);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean getStudent(Student student) {
        if (students.contains(student)) {
            return true;
        }
        else {
            return false;
        }
    }

    public List<String> studentNames() {
        List<String> studentNames = new ArrayList<>();
            for (Student student : students) {
                studentNames.add(student.studentName());
            }
        return studentNames;
    }
}
