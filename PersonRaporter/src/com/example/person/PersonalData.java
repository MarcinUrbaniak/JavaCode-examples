package com.example.person;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonalData {

    private List<Person> personList = new ArrayList<>();

    public PersonalData() {
    }


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalData that = (PersonalData) o;
        return Objects.equals(personList, that.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personList);
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "personList=" + personList +
                '}';
    }



}
