package abstrakcje;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Krzeslo krzeslo1 = new Krzeslo();

        krzeslo1.fruwaj("fruwaj");
        int cos = krzeslo1.stlaFinalna;
        System.out.println(cos);


        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new TreeSet<>();
        Collections.addAll(stringList,"jeden", "dwa");
        Collections.addAll(stringSet, "23", "67","wojciech ", "adam");

        //Collections.sort();

        System.out.println(stringList);
        System.out.println(stringSet);

        System.out.println(stringList.contains("dwa"));
        System.out.println(stringList.contains("trzy"));


        for (String string: stringList
             ) {
            System.out.println("string = " + string);
            stringList.remove("dwa");
        }

        Map<String, String> getEnv = System.getenv();
        Set<String> keySet = getEnv.keySet();

        for (String key: keySet
             ) {
            System.out.println(key + " " + getEnv.get(key));
        }

    }
}
