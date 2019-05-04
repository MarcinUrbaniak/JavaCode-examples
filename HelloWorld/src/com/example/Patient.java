package com.example;

//Masz klasę która przechowuje dane pacjentów w przychodni: imię i nazwisko, wiek, choroba.
// Do listy dodaj 5 pacjentów i następnie posortuj je według: choroby, nazwiska i imienia.
// Wynik sortowania wyświetl na ekranie

import java.util.Objects;

public class Patient  implements Comparable{

    private String firstName;
    private String lastName;
    private int age;
    private String disease;

    public Patient(String firstName, String lastName, int age, String disease) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.disease = disease;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                firstName.equals(patient.firstName) &&
                lastName.equals(patient.lastName) &&
                disease.equals(patient.disease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, disease);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Patient patient = (Patient) o;
        if(this == patient){
        return 0;
        }

        if (this.disease.equals(patient.getDisease())){
            if (this.lastName.equals(patient.getLastName())){
                return this.firstName.compareTo(patient.getFirstName());
            }
        }
        return this.disease.compareTo(patient.getDisease());
    }
}
