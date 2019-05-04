package com.course_application;

public class LocalUser implements User {

    private String firstName;
    private String lastName;
    private String city;

    public LocalUser(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void openDoor(){
        System.out.println("Drzwi otwarte");
    }

    public void closeDoor(){
        System.out.println("Drzwi zamknięte");
    }

    @Override
    public String toString() {
        return "LocalUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
