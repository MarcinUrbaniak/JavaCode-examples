package zadanie_55;

public class Factorial {

    /**
     * „Napisz program, który rekurencyjnie oblicza kolejne wartości n! dla n = 10 i wynik wyświetla na ekranie komputera.”
     *
     */
    public long factorial(int number){
        long output = 1;
        if (number >= 2){
            output = number*factorial(number -1);
        }
        return output;
    }



}
