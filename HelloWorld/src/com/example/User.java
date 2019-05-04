package com.example;

public class User {

    private String firstName;
    private String latsName;

    /**
     * Konstruktor
     * @param firstName
     * @param latsName
     */

    public User(String firstName, String latsName) {
        this.firstName = firstName;
        this.latsName = latsName;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLatsName() {
        return latsName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName + "AAA";
    }

    public void setLatsName(String latsName) {
        this.latsName = latsName;
    }

    //robimy override metody toString, equals, hascode
    @Override
    public String toString() {
        return "com.example.User{" +
                "firstName='" + firstName + '\'' +
                ", latsName='" + latsName + '\'' +
                '}';
    }
}
