package com.course_application;

public class Room {

    private String roomName;
    private int roomNumber;
    private int roomFloor;
    private Course course;

    public Room(String roomName, int roomNumber, int roomFloor) {
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.roomFloor = roomFloor;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomNumber=" + roomNumber +
                ", roomFloor=" + roomFloor +
                ", course=" + course +
                '}';
    }
}
