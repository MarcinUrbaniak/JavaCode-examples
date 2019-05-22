package zadanie_57;

public class Main {
    public static void main(String[] args) {

        int  n = 10;
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Program znajduje pierwszych 10 liczb ciągu Fibonnacciego: ");

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci.fibo(i));
        }

    }
}
