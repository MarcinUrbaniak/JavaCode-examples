package com.example.raport;

import com.example.person.PersonalData;

public class SimpleReport extends AbstractReport {


    public SimpleReport(PersonalData personalData) {
        this.personalData = personalData;
        System.out.println("=========PROSTY RAPORT=============");
        System.out.println("minimalne wynagrodzenie: " + minSalary(this.personalData));
        System.out.println("maksymalne wynagrodzenie: " + maxSalary(this.personalData));
        System.out.println("średnie wynagrodzenie " + averageSalary(this.personalData));
        System.out.println("najlepszy zawód to: " + bestProfession(this.personalData));
        System.out.println("najgorszy zawód to: " + worstProfession(this.personalData));
        System.out.println("========KONIEC RAPORTU=============");

    }



}
