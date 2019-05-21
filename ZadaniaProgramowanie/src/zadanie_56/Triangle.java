package zadanie_56;

public class Triangle {

    /**
     * „Napisz program, który rekurencyjnie znajduje 10 pierwszych liczb trójkątnych i wyświetla je na ekranie komputera.
     *
     *
     *
     * W matematyce liczba trójkątna to taka, którą można zapisać w
     * postaci sumy kolejnych początkowych liczb naturalnych:
     * Tn = 1 + 2 + 3 + (n – 1) + n. Liczby należące do tego
     * ciągu nazywane są trójkątnymi, gdyż można je przedstawić w formie trójkąta. Na przykład #6 = 21.”
     *
     */

    int n;

    public static int triangle(int n){
        if (n == 1){
            return 1;
        } else {
            return (n + triangle(n -1 ));
        }
    }


}
