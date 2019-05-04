package com.example.raport;

import com.example.person.PersonalData;
import com.example.person.Person;
import com.example.person.Profession;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public abstract class AbstractReport {

    protected PersonalData personalData;


    public AbstractReport() {
    }


    public List<Person> personsSortByFirstName(PersonalData personalData){
        this.personalData = personalData;

        Collections.sort(this.personalData.getPersonList(), new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        return this.personalData.getPersonList();

    }

    public List<Person> personsSortBySalary(PersonalData personalData){
        this.personalData = personalData;

        Collections.sort(this.personalData.getPersonList(), new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getSalary() + o2.getEducation().getSalaryAdition() + o2.getProfession().getSalaryAdition(),
                        o1.getSalary() + o1.getEducation().getSalaryAdition() + o1.getProfession().getSalaryAdition());
            }
        });


        return this.personalData.getPersonList();
    }


    public double averageSalary(PersonalData personalData){
        this.personalData = personalData;
        double sum = 0;
        int count = 0;
        double avg = 0;

        for (Person person: this.personalData.getPersonList()
             ) {
            sum += person.getSalary() + person.getProfession().getSalaryAdition()+ person.getEducation().getSalaryAdition();
            count ++;
        }

        avg = sum / count;

        return avg;
    }

    public double maxSalary(PersonalData personalData){
        this.personalData = personalData;
        double maxSalary = 0;
        for (Person person: this.personalData.getPersonList()
             ) {
            if(maxSalary < (person.getSalary() + person.getEducation().getSalaryAdition() + person.getProfession().getSalaryAdition())){
                maxSalary = (person.getSalary() + person.getEducation().getSalaryAdition() + person.getProfession().getSalaryAdition());
            }
        }

        return  maxSalary;

    }

    public double minSalary(PersonalData personalData){
        this.personalData = personalData;
        double minSalary = this.personalData.getPersonList().get(0).getSalary() + this.personalData.getPersonList().get(0).getProfession().getSalaryAdition()
                + this.personalData.getPersonList().get(0).getEducation().getSalaryAdition();

        for (Person person: this.personalData.getPersonList()
             ) {
            if(minSalary > (person.getSalary() + person.getEducation().getSalaryAdition() + person.getProfession().getSalaryAdition())){
                minSalary = (person.getSalary() + person.getEducation().getSalaryAdition() + person.getProfession().getSalaryAdition());
            }
        }
        return  minSalary;
    }


    public Profession bestProfession(PersonalData personalData){
        this.personalData = personalData;
        double maxSalary = maxSalary(this.personalData);
        Profession bestProfession = null;

        for (Person person: this.personalData.getPersonList()
             ) {
            if(person.getProfession().getSalaryAdition() + person.getEducation().getSalaryAdition() + person.getSalary() == maxSalary){
                bestProfession = person.getProfession();

            }
        }

        return bestProfession;

    }

    public Profession worstProfession(PersonalData personalData){
        this.personalData = personalData;
        double minSalary = minSalary(this.personalData);
        Profession worstProfession = null;

        for (Person person: this.personalData.getPersonList()
             ) {
            if(person.getProfession().getSalaryAdition() + person.getEducation().getSalaryAdition() + person.getSalary() == minSalary){
                worstProfession = person.getProfession();
            }
        }
        return worstProfession;

    }




}


