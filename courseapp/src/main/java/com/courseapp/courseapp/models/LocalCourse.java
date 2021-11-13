package com.courseapp.courseapp.models;

public class LocalCourse {

    private String name;
    private String room;

    public LocalCourse(String courseName, String classRoom) {
        this.name = courseName;
        this.room = classRoom;
    }
        public String getName() {
        return this.name;
    }

    public String getRoom() {
        return this.room;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setRoom(String room) {
        this.room = room;
    }
}
