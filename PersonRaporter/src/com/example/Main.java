package com.example;

import com.example.person.Education;
import com.example.person.Person;
import com.example.person.PersonalData;
import com.example.person.Profession;
import com.example.raport.DetailReport;
import com.example.raport.SimpleReport;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        Person person0 = new Person("Wojciech","Kazimierski", 45, Profession.ANALITYK, Education.PODYPLOMOWE, 6);
        Person person2 = new Person("Robert","Wolski", 34, Profession.LOGISTYK, Education.SREDNIE, 1);
        Person person3 = new Person("Anna","Wójcik", 24, Profession.SPRZEDAWCA, Education.PODSTAWOWE, 2);
        Person person1 = new Person();

        person1.setAge(45);
        person1.setEducation(Education.PODYPLOMOWE);
        person1.setFirstName("Krzysztof");
        person1.setLastName("Nawrocki");
        person1.setProfession(Profession.ANALITYK);
        person1.setSalary(50);



        PersonalData personalData = new PersonalData();
        personalData.setPersonList(Arrays.asList(person0,person1,person2,person3));


        /**
         * Prezentacja danych osobowych - metoda statyczna wyświetla dane z listy
         */
        BootStrap.getPersonalData(personalData);
        System.out.println("");

        /**
         * Generowanie Raportu
         */

        SimpleReport simpleReport = new SimpleReport(personalData);
        System.out.println("=====");
        DetailReport detailReport = new DetailReport(personalData, "name");
        System.out.println("=====");
        DetailReport detailReport1 = new DetailReport(personalData, "salary");


    }
}
