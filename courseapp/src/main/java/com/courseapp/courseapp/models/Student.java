package com.courseapp.courseapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private static AtomicInteger count = new AtomicInteger(0); 

    private long studentId;
    private String name;

    public Student(String name) {
        this.name = name;
        this.studentId = count.incrementAndGet(); 
    }

    public String getStudent() {

        StringBuilder builder = new StringBuilder();
        builder.append(name);
        String fullName = builder.toString();

        return fullName;
    }
    
}