package com.example.person;

import java.util.Objects;

public class Person {

/**
 * Person będą przechowywane dane osobowe: Imię, nazwisko, wiek, wykonywany zawód, wykształcenie, wynagrodzenie podstawowe
 * (firstName, lastName, age, profession, education, salary)
 */

    private String firstName, lastName;
    private int age;
    private Profession profession;
    private Education education;
    private double salary;


    public Person() {
    }

    public Person(String firstName, String lastName, int age, Profession profession, Education education, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.education = education;
        this.salary = salary;
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

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public Profession getProfession() {
        return profession;
    }

    public Education getEducation() {
        return education;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                profession == person.profession &&
                education == person.education;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, profession, education, salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession=" + profession +
                ", education=" + education +
                ", salary=" + salary +
                '}';
    }
}



