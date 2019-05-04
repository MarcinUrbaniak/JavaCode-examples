package com.collections;

import java.util.Map;
import java.util.Set;

public class Example6SystemMap {
    public static void main(String[] args) {

        Map<String, String> getEnw = System.getenv();
        Set<String> keySet = getEnw.keySet();

        for (String key: keySet
             ) {
            System.out.println("Zmienna systemowa: " + key + " ma wartość: " + getEnw.get(key) );
        }

        System.out.println(getEnw.toString());
    }
}
