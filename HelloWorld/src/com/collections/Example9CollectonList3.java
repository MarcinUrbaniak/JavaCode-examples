package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example9CollectonList3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4");
        System.out.println("Na indeksie pierwszym jest " + list.get(1));
        list.set(2, "dwanaście");
        System.out.println(list);

        Iterator<String> i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
