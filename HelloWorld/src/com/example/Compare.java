package com.example;

import java.util.Comparator;

public class Compare {
    public static void main(String[] args) {
        Comparator<String> stringComparator = Comparator.naturalOrder();
        System.out.println("proównanie B i B: " + stringComparator.compare("B", "B"));
        System.out.println("proównanie A i B: " + stringComparator.compare("A", "B"));
        System.out.println("proównanie C i B: " + stringComparator.compare("C", "B"));

    }
}
