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

        Stream.of("Warszawa", "Kraków", "Katowice", "Wrocław")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);



    }


}
