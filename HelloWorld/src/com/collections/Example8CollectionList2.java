package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Example8CollectionList2 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);


        int index = -1;
        for (Integer integer : integerList
        ) {
            System.out.println(integer);
            if (integer == 2) {
                index = integer;
            }

        }
        System.out.println(index);

        if (index >= 0) {
            integerList.remove(index);
        }
        System.out.println(integerList.toString());
    }
}
