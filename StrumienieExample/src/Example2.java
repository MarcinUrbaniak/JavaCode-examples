import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) throws IOException {


        /**
         * Tworzy strumien z pliku tekstowego zawierajace dane w pliku data.txt - format csv
         * nastepnie pykonuje podzial danych po znaku ","
         * oraz filtruje i zlicza te ktore sa poprawne (maja dlugosc = 3
         */
        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));

        int rowCount = (int) rows1.map(x -> x.split(","))
        .filter(x -> x.length == 3)
        .count();

        rows1.close();

        System.out.println("rowCount = " + rowCount);

/**
 * Teraz dodajemy warunek na 2 kolumnę x[1] z wykorzystaniem partowania do inta
 */

        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));

        rows2.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

        rows2.close();

    }
}
