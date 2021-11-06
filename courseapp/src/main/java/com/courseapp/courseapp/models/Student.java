package com.courseapp.courseapp.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private static AtomicInteger count = new AtomicInteger(0); 

    private long studentId;
    private String name;

    public Student(String name) {
        this.name = name;
        this.studentId = count.incrementAndGet(); 
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(String.valueOf(studentId));
        builder.append(", ");
        builder.append(name);

        return builder.toString();
    }
    
}