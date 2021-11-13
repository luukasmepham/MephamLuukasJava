package com.courseapp.courseapp.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private static AtomicInteger count = new AtomicInteger(0); 

    private long studentId;
    private String f_name;
    private String l_name;

    public Student(String name) {

        this.studentId = count.incrementAndGet(); 

        String[] names = name.split("@");
        String f_name = names[0];
        String l_name = names[1];

        this.f_name = f_name;
        this.l_name = l_name;
    }

    /*

    public String getStudent() {

        StringBuilder builder = new StringBuilder();
        builder.append(l_name);
        builder.append(" ");
        builder.append(f_name);
        String fullName = builder.toString();

        return fullName;
    }
    */

    public long getId() {
        return this.studentId;
    }

    public String getF_Name() {
        return this.f_name;
    }

    public String getL_Name() {
        return this.l_name;
    }
    
}