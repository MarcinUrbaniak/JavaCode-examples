import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        int[] numbers = new int[]{10, 3, 15,22, -7 };

        int min = Integer.MAX_VALUE;

        /**
         * Standardowe wyszukiwanie wartości minimalnej
         */

        for (int number: numbers){
            if (number < min){
                min = number;
            }
        }
        System.out.println("min = " + min);

        /**
         * i teraz to samo z wykorzystaniem strumieni
         */

        int min2 = IntStream.of(numbers)
                .min()
                .getAsInt();

        System.out.println("min2 = " + min2);

/**
 * Strumien z wykorzystaniem lambdy value ->
 */

        IntStream.of(numbers)
                .distinct()
                .min()
                .ifPresent(value -> System.out.println("Consumer: " + value));


        /**
         * Drukuje liczby od 1 do 9
         * dwa dwukropki to skrócona wersja dla .foreach(value -> (System.out.println(value)
         * skip - pomija 5 pierwszych wartości
         */

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::println);


        /**
         * Sumuje dziesięć pierwszych
         */

        System.out.println(
                IntStream
                .range(1,10)
                .sum()
        );


        /**
         * Tworzymy strumie teksow, sortujemy, wybieramy pierwszy i wyswietalmy
         */

        Stream.of("Warszawa", "Kraków", "Katowice", "Wrocław", "Adamowice")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


/**
 * Tworzę stumien z tablicy, wybiera rozpoczynające sie na litere b , sortuje i wyświetla
 */
        String[] names = {"Katarzyna", "Andrzej", "Barnaba"};

        Arrays.stream(names) //odpowiednik Stream.of(names)
                .filter(x -> x.startsWith("B"))
                .sorted()
                .forEach(System.out::println);

        /**
         * to samo robimy na kolekcji
         */

        List<String> stringList = Arrays.asList(names);
        stringList.stream()
                .filter(x ->x.startsWith("K") )
                .sorted()
                .forEach(System.out::println);


        //Wylicza średnią potęg podanych liczb
        //dwa sposoby lambdy w strumieniach

        Arrays.stream(new int[]{2,4})
             //   .map(x -> x*x)
                .map(x -> {
                    return x * x;
                })
                .average()
                .ifPresent(System.out::println);



//to samo starą metodą
        List<Integer> integerList = new ArrayList<>();
        integerList = Arrays.asList(2, 4);
        int sum = 0;
        int count = 0;

        for (Integer integer: integerList
             ) {
            sum += integer*integer;
            count ++;

        }
        System.out.println("suma średniej z sumy potęg = " + sum/count);



        //Tworzy strumien z listy natepnie przeprowadza mapowania oraz filtrowanie
        List<String> names2 = Arrays.asList("Katarzyna", "Beata", "Antoni");

        names2.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

    /** Pobiera dane z pliku, filtruje i
    *
    */

        Stream<String> bands = null;

        try {
            bands = Files.lines(Paths.get("zespoly.txt")); //Files.lines - tworzy strumien danych obiektem jest
            //kazda linia
            bands.sorted()
                    .filter(x -> x.length() > 10)
                    .forEach(System.out::println);


            bands = Files.lines(Paths.get("zespoly.txt")); //Files.lines - tworzy strumien danych obiektem jest
            //kazda linia


            List<String> collect = bands.sorted()
                    .filter(x -> x.length()>10)
                    .map(s -> s.toLowerCase())
                    .collect(Collectors.toList());

            System.out.println("collect = " + collect);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            bands.close();
        }


    }


}
