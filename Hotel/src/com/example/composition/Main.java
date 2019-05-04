package com.example.composition;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Belveder", "Warszawa03-009, ul. Matejki 34");

        Room room1 = new Room("11", 1, 4);
        Room room2 = new Room("12", 1, 4);
        Room room3 = new Room("14", 1, 3);
        Room room4 = new Room("21", 2, 2);
        Room room5 = new Room("31", 3, 11);

        TV tv1 = new TV("111-ABC", "Panasonic 123", 32, "4K");
        TV tv2 = new TV("334-ABC", "Sony 13", 38, "HD");

        AirConditioner airConditioner1 = new AirConditioner("343-12", "LG 5465", 3500, 60);
        AirConditioner airConditioner2 = new AirConditioner("432-12", "GREE600", 3000, 55);

        Restaurant restaurant = new Restaurant("Apetit", "8:00 - 16:00");


        room1.setTv(tv1);
        room1.setAirConditioner(airConditioner1);
        room2.setTv(tv2);
        room3.setAirConditioner(airConditioner2);
        hotel.setRooms(new Room[]{room1, room2, room3, room4, room5});
        hotel.setRestaurant(restaurant);
        restaurant.setHotel(hotel);


        System.out.println(hotel);

        System.out.println("Maksymalna liczba gości w hotelu to: " + hotel.getNumberOfGuests());


    }
}
