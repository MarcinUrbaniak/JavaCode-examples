package com.example.raport;

import com.example.person.Person;
import com.example.person.PersonalData;

import java.util.Objects;

public class DetailReport extends SimpleReport {

    /**
     * sortType przyjmuje dwie wartości name i salary i na tej podstawie wyświetla raport
     */
    String sortType = "name";

    public DetailReport(PersonalData personalData, String sortType) {
        super(personalData);
        this.sortType = sortType;

        if (sortType.equals("name")) {
            personsSortByFirstName(this.personalData);
        } else if (sortType.equals("salary")) {
            personsSortBySalary(this.personalData);
        }

        System.out.println("Dane posortowane wg: " + sortType);
        for (Person person : personalData.getPersonList()
        ) {

            System.out.println("Imię: " + person.getFirstName() + " nazwisko: " + person.getLastName() + ", zarobki podstawowe: " + person.getSalary() + ", zawód: " + person.getProfession() + ", wykształcenie: " + person.getEducation()) ;
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailReport that = (DetailReport) o;
        return Objects.equals(sortType, that.sortType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortType);
    }
}
