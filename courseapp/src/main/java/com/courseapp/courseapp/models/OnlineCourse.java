package com.courseapp.courseapp.models;

public class OnlineCourse {

    private String name;
    private String link;

    public OnlineCourse(String courseName, String courseLink) {
        this.name = courseName;
        this.link = courseLink;
    }

    public String getName() {
        return this.name;
    }

    public String getLink() {
        return this.link;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setLink(String link) {
        this.link = link;
    }
}
