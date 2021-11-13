package com.courseapp.courseapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Course {

    private OnlineCourse online;
    private LocalCourse local;

    private static AtomicInteger count = new AtomicInteger(0); 

    private final long courseId;
    private String course_name;
    private String teacher_name;

    private boolean isOnline = false;

    private List<Student> students = new ArrayList<>();

    public Course(String name) {

        this.courseId = count.incrementAndGet(); 

        String[] names = name.split("@");
        String course_name = names[0];
        String teacher_name = names[1];

        if (names.length == 4) {
            OnlineCourse newOnlineCourse = new OnlineCourse(names[0], names[2]);
            this.online = newOnlineCourse;
            this.isOnline = true;
        }
        else if (names.length == 3) {
            LocalCourse newLocalCourse = new LocalCourse(names[0], names[2]);
            this.local = newLocalCourse;
        }

        this.course_name = course_name;
        this.teacher_name = teacher_name;
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

    public String getAddress() {
        if (isOnline == true) {
            return online.getLink();
        }
        else if (isOnline == false) {
            return local.getRoom();
        }
        else {
            return "No address";
        } 
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

    public boolean courseType() {
        return isOnline;
    }
}
