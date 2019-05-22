package zadanie_61;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

    String data, data1;


    public void readData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj imię i nazwisko ");
        data = scanner.nextLine();

    }

    public void writeDataToFile() throws IOException {
        System.out.println("Zapis danych do pliku dane.txt");

        FileWriter fileWriter = new FileWriter("dane.txt");
        fileWriter.write(data);
        fileWriter.close();

    }

    public void readDataFromFile() throws IOException{

        System.out.println("Odczyt danych z pliku dane.txt");
        FileReader fileReader = new FileReader("dane.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((data1 = bufferedReader.readLine()) != null){
            System.out.println(data1);
        }
        fileReader.close();


    }
}
