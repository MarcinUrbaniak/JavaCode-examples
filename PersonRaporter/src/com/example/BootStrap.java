package com.example;

import com.example.person.PersonalData;
import com.example.person.Person;

public class BootStrap {

    private PersonalData personalData;


    public static void getPersonalData(PersonalData personalData){


        for (Person person: personalData.getPersonList()
             ) {
            System.out.println("imię: " + person.getFirstName() + ", nazwisko: " + person.getLastName() + ", wiek: " + person.getAge());
        }
    }


}
