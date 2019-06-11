package homebudget.userinterface;

import java.util.Scanner;

public class DataFromUser {


//        System.out.println("Domowy budżet 1.0");
//        System.out.println("Jeśli chcesz dodać informację o wydatkach wpisz 0");
//        System.out.println("Jeśli chcesz dodać informację o przychodach wpisz 1");


    public static int expense(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę wydatku");
        double ammount = Double.parseDouble(scanner.nextLine());

        int selection = Integer.parseInt(scanner.nextLine());


        return selection;


    }

}
