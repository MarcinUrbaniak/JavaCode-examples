package com.example.composition;

public class Room {

    private String number;
    private int floor;
    private TV tv;
    private AirConditioner airConditioner;
    private int guests;


    public Room(String number, int floor) {
        this.number = number;
        this.floor = floor;
    }

    public Room(String number, int floor, int guests) {
        this.number = number;
        this.floor = floor;
        this.guests = guests;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Room number " + number +" guests: " +  guests +" : tv=" + tv + ", airConditioner= " + airConditioner;
    }
}

