package com.course_application;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Angielski");

        Room room1 = new Room("Pokoj 7", 7, 4);

        User user1 = new RemoteUser("Adam", "Kowalik", "Gdańsk");
        User user2 = new RemoteUser("Janusz", "`Majewski", "Katowice");
        User user3 = new LocalUser("Adam", "Kowalik", "Warszawa");
        User user4 = new LocalUser("Anna", "Kusmider", "Poznań");



        course1.setRoom(room1);
        course1.setUsers(new User[]{user1, user2, user3, user4});


        System.out.println(room1);
        System.out.println(course1);
    }
}
