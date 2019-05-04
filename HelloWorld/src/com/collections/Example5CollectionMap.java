package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Example5CollectionMap {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();


        stringMap.put("1", "Jeden");
        stringMap.put("2", "Dwa");
        stringMap.put("3", "Trzy");
        stringMap.put("4", "Cztery");
        stringMap.put("5", "Pięć");


        Set<String> keySet = stringMap.keySet();
        System.out.println(keySet.toString());

        for (String key: keySet
             ) {
            System.out.println("Klucz: " + key + " Wartość: " + stringMap.get(key));
        }

        System.out.println("Mapa zawiera klucz 1: "+ stringMap.containsKey("1"));
        System.out.println("Mapa zawiera klucz 10: "+ stringMap.containsKey("10"));

        System.out.println("Mapa zaiwera wartośc Pięć " + stringMap.containsValue("Pięć"));
        System.out.println("Mapa zaiwera wartośc Jeden " + stringMap.containsValue("Jeden"));

        System.out.println(stringMap.toString());

        String message = "1 2 3 Start. Programujemy coraz lepiej ... ";
        System.out.println("Orginalny komunikat: " + message);

        Set<String> words = stringMap.keySet();
        for (String word: words
             ) {
            message = message.replace(word, stringMap.get(word));
            
        }
        System.out.println("komunikat po zmiianie " + message);

    }

}
