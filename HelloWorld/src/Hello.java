import com.collections.Comparison;
import com.example.*;

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        User user1 = new User("Jan", "Kowalski");
        User user2 = new User("Anna", "Nowak");
        User user3 = new User("Anna", "Nowak");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        if (user2 == user3) {
            System.out.println("są równe");
        }

        User user4 = user3;

        if (user2.equals(user3)) {
            System.out.println("są równe w metodzie equals");
        }


        System.out.println(user2.equals(user3));

        //w tym porownaniu mamy tą samą referencję
        System.out.println(user4.equals(user3));

        System.out.println(user1.hashCode());
        System.out.println(user1.hashCode());

        System.out.println(user2.hashCode());

        user2.setFirstName("Monika");
        System.out.println(user2.getFirstName());
        System.out.println(user2);

        Energy energy = new Energy(12, 45);
        System.out.println(energy.getEnergy());

        energy.setMass(-50);

        System.out.println(energy.getMass());
        System.out.println(energy.getEnergy());


        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);

        phone1.setNumber("65664545484");
        phone1.setOwner("Anna");
        phone1.setColor(12154);

        Phone phone5 = new Phone("545488", "Alicja", "Nokia", "r5", "154214.2");
        System.out.println(phone5);

        System.out.println(phone1);


        Flyable superHero = new SuperHero();
        SuperHero superHero2 = (SuperHero) superHero;
        superHero.fly();
        ((SuperHero) superHero).swim();
        superHero2.swim();

        Swimable superHero3 = new SuperHero();

        superHero.flyAvay();

        DaysOfWeek firstDay = DaysOfWeek.MONDAY;
        System.out.println(firstDay.getDayNo());


        for (DaysOfWeek day : DaysOfWeek.values()
        ) {
            System.out.println(day.getDayNo());

        }

        for (DaysOfWeek day : DaysOfWeek.values()
        ) {
            System.out.println(day);

        }

        if (firstDay == DaysOfWeek.MONDAY) {
            System.out.println("first day to jest poniedziałek");
        }
        if (firstDay.equals(DaysOfWeek.MONDAY)) {
            System.out.println("first day to jest poniedziałek");
        }


        List<Patient> patientList = new ArrayList<>();
        patientList.add(0, new Patient("Anna", "Kowaslka", 55, "zapalenie płuc"));
        patientList.add(1, new Patient("Wojciech", "Nowak", 5, "grypa"));
        patientList.add(2, new Patient("Robert", "Nowak", 12, "grypa"));
        patientList.add(3, new Patient("Karol", "Bartkowiak", 43, "ebola"));
        patientList.add(4, new Patient("Bartłomiej", "Wyżyk", 55, "zawał"));



        //System.out.println(patientList.toString());

        System.out.println("Przed sortowaniem");
        for (Patient patient : patientList
        ) {
            System.out.println(patient);
        }

        System.out.println("Po sortowaniu: ");
        //sortowanie wg domyślnego komparatora w klasie Patient
        Collections.sort(patientList);

        for (Patient patient : patientList
        ) {
            System.out.println(patient);
        }
        //Sortowanie wg nazwiska
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("Po sortowaniu wg nazwiska");
        for (Patient patient : patientList
        ) {
            System.out.println(patient);

        }
/**
 *filtrujemy teksty z forum internetowego pod kątem brzydkich słów:
 *stwórz listę tekstów zawarty w kolekcji typu list
 *stwórz słownik brzydkich tematów zawaarty w kolekcji typu set
 *..każdy wyraz ze słownika ma być zamieniony na  "............"
 */

        for (int i = 0; i < 40; i++) {
            System.out.print("#");
        }
        System.out.println("");

        List<String> textList = new ArrayList<>();
        textList.add(0, new String("To jest zdanie z brzytkim wyrazem Motyla noga"));
        textList.add(1, new String("To jest zdanie z bez brzydkiego wyrazu"));
        textList.add(2, new String("To jest zdanie z cholera w środku"));

        String replace = "........";

        List<String> censoredList = new ArrayList<>();



        List<String> uglyWordSet = new ArrayList<>();
        uglyWordSet.add("Mot");
        uglyWordSet.add("Motyla noga");
        uglyWordSet.add("Kurcze pióra");
        uglyWordSet.add("cholera");

        Collections.sort(uglyWordSet, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        System.out.println(uglyWordSet);

        for (String text : textList
        ) {
            for (String uglyText : uglyWordSet
            ) {
                text = text.replace(uglyText, replace);
            }
            censoredList.add(text);
        }
        System.out.println(censoredList);

/**
 * Masz listę typu List<Integer> gdzie wprowadzasz powtarzające się wartości:
 *{20,20,31,30,34,30,40,43,40,20,10,11,20,30}.
 * Przy pomocy iteratora (pętla forEach) przepisz tą listę do kolekcji typu Set<Integer>. Wydrukuj na ekranie
 * zawartość obydwu kolekcji. Zobacz czy z kolekcji typu Set zostały usunięte duplikaty.
 */

        List<Integer> integerList = Arrays.asList(20,20,31,30,34,30,40,43,40,20,10,11,20,30);
        Set<Integer> integerSet = new HashSet<>();

        integerSet.addAll(integerList);

        /**
         * lub inny sposób po pętli
         */

        for (Integer integer: integerList
             ) {
            integerSet.add(integer);

        }
        System.out.println(integerSet);



        /**
         * Zabawa z obiektami klasy person
         */

        List<Person> personList = new ArrayList<>();
        personList.add(0,new Person("Robert", "Kowalski") );
        personList.add(1,new Person("Krzysztof", "Uowalski") );
        personList.add(2,new Person("Adam", "Bugalski") );
        System.out.println(personList);
        System.out.println(personList.size());
        System.out.println(personList.get(0).getLastName());

        for (Person person: personList
        ) {
            System.out.println(person);
        }

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        //System.out.println(personList);
        for (Person person: personList
             ) {
            System.out.println(person);
        }

        String text1 = "Hello of the darkens world";
        String text2 = text1.replace("of the darkens world", "WORLD");
        System.out.println(" tekst: " + text1 + " zamienia na " + text2);

        String text3 = text1.substring(0, 6) + text1.substring(21).toUpperCase();

        System.out.println(text3);

        /**
         * Masz listę liczb typu integer {3, 9, 1, 2, 4, 9, 6, 5}. Napisz metodę ktora zwróci listę trzech najsiększych
         * liczb. Napisz porównanie które wypisze na ekranie "Success" jeżeli zwrócone liczny są równe: {9,9,6} lub Error
         * jeżeli są zwrócone inne wartości.
         */

        List<Integer> integers = new ArrayList<>();
        List<Integer> maxIntegers = new ArrayList<>();
        Collections.addAll(integers, 3, 9,1, 2,4,9,6,5);

        System.out.println(integers);


        for (int k = 0; k < 3; k++) {

            int i = Collections.max(integers);
            maxIntegers.add(i);
            int j = integers.indexOf(i);
            integers.remove(j);
        }




        System.out.println(maxIntegers);

        List<Integer> basicList = new ArrayList<>();
        Collections.addAll(basicList, 9,2,6);

        boolean check =  maxIntegers.retainAll(basicList);
        System.out.println(check);

        if (check == false ){
            System.out.println("Success");

        }else {
            System.out.println("Error");
        }


        if(basicList.equals(maxIntegers)){
            System.out.println("Sukces");
        }else System.out.println("Błąd");


        Comparison comparison = new Comparison(integers, basicList);
        System.out.println(comparison.compareThreeMax(integers, basicList));

        Collections.addAll(integers, 3, 9,1, 2,4,9,6,5);


        System.out.println(integers);
        System.out.println("integers.size() = " + integers.size());
        //System.out.println("To jest lista " +  comparison.returnMaxList(integers, 3));
        //.out.println("To jest lista " +  comparison.returnMaxList(integers, 4));
        System.out.println("To jest lista " +  comparison.returnMaxList(integers, 11));

        comparison.checkList(integers, basicList);






    }

}

