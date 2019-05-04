package com.example.composition;


import java.util.Arrays;


public class Hotel {
    private String name;
    private String address;
    private Room[] rooms;
    private Restaurant restaurant;


    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getNumberOfGuests() {

        Room[] rooms = this.getRooms();
        int numberOfGuests = 0;

        for (Room room : rooms
        ) {
            numberOfGuests += room.getGuests();
        }
        return numberOfGuests;
    }

    @Override
    public String toString() {
        return "Hotel " + name + ", rooms= " + Arrays.toString(rooms) +
                ", connectet with restaurant = " + restaurant;
    }

}
