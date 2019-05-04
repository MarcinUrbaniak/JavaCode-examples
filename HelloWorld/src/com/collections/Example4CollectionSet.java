package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Example4CollectionSet {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Jeden");
        stringList.add("Dwa");
        stringList.add("Trzy");
        stringList.add("Cztery");
        stringList.add(3, "Dwa");
        stringList.add(3, "Pięć");
        stringList.add(4, "Sześć");
        stringList.add(5, "Sześć");


        for (String number: stringList
             ) {
            System.out.println(number);

        }

        System.out.println("W liście na pozycji 0 jest " + stringList.get(0) );
        System.out.println("W liście na pozycji 3 jest " + stringList.get(3) );

        System.out.println("W liście Trzy jest na pozycji: " + stringList.indexOf("Trzy"));
        System.out.println("W liście Pięć jest na pozycji: " + stringList.indexOf("Pięć"));

        System.out.println("Do listy dodano " + stringList.size());

        stringList.remove("Pięć");

        System.out.println(stringList.toString());

    }
}
