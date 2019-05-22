package zadanie_57;

public class Fibonacci {


    /**
     * „Napisz program, który znajduje 10 pierwszych liczb Fibonacciego i wyświetla je na ekranie komputera.”
     *
     */


    public int fibo(int n){

        switch (n){
            case 0: return 0;
            case 1: return 1;
            default: return fibo(n - 1) + fibo(n - 2);
        }

    }


}
