package com.collections;

import java.util.*;

public class Example3CollectionSet {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        strings.add("Jeden");
        strings.add("Dwa");
        strings.add("Dwa");
        strings.add("Trzy");
        strings.add("Cztery");
        strings.add("Cztery");

        for (String string: strings
             ) {
            System.out.println(string);

        }

        System.out.println("Ilośc elementów w kolekcji wynosi: " + strings.size());


        System.out.println("Czy w kolekcji występuje wyraz Dwa: " + strings.contains("Dwa"));


        strings.remove("Dwa");
        System.out.println("Czy w kolekcji występuje wyraz Dwa: " + strings.contains("Dwa"));

        System.out.println("Czy w kolekcji występuje wyraz Adam: " + strings.contains("Adam"));
        System.out.println("Czy w kolekcji występuje wyraz Adam: " + strings.contains("Adam"));

        System.out.println("Czy kolekcja jest pusta " + strings.isEmpty());

        strings.clear();
        System.out.println("Czy kolekcja jest pusta " + strings.isEmpty());

        Set<String> strings2 = new HashSet<>();
        strings2.add("Michal");
        strings2.add("Mikolaj");
        strings2.add("Maksymilian");

        strings2.remove("Mikolaj");

        Collections.addAll(strings2, "Anna", "Wojciech");
        boolean b = strings2.contains("Anna");

       Set<String> string3 = new HashSet<>();
       Collections.addAll(string3, "Anna", "Wojciech");


        for (String string: strings2
             ) {
            System.out.println(string);

        }
        for (String string: string3
             ) {
            System.out.println(string);

        }
        boolean b1 = strings2.containsAll(string3);

        System.out.println(
                b + " " + b1
        );

        strings2.retainAll(string3);

        System.out.println(strings2);
        System.out.println(string3);

    }
}
