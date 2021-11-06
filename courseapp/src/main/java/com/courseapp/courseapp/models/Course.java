package com.courseapp.courseapp.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Course {

    private static AtomicInteger count = new AtomicInteger(0); 

    private long courseId;
    private String name;

    public Course(String name) {
        this.name = name;
        this.courseId = count.incrementAndGet(); 
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(String.valueOf(courseId));
        builder.append(", ");
        builder.append(name);

        return builder.toString();
    }
}
