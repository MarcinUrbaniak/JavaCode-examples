package com.course_application;

public class RemoteUser implements User{

    private String firstName;
    private String lastName;
    private String city;

    public RemoteUser(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void login(){
        System.out.println("Użytkownik zalogowany");

    }

    public void logout(){
        System.out.println("Użytkownik wylogowany");
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "RemoteUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
