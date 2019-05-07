package zadanie_52;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Trinomial {


    double a , b , c, delta, x1, x2;

    int numberOfElements;

    public void readData() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj a: ");
        a = Double.parseDouble(br.readLine());

        if (a == 0){
            System.out.println("Niedozwolona wartość współczynnika a");
            System.exit(1);
        }
        else {

            System.out.println(" Podaj b: ");
            b = Double.parseDouble(br.readLine());

            System.out.println(" Podaj c: ");
            c = Double.parseDouble(br.readLine());

        }



        /**
         * A = (Sr(r+1)^N)/(((r+1)^N)-1)
         * gdzie
         * A - rata równa kredytu
         * S - wysokość kredytu
         * r - stopa dostosowana (czyli np dla 3,5% 0,035/12)
         * N - liczba rat
         *
         * dla rat malejących:
         * A(n) = S(1+(N-n+1)*r)/N
         * gdzie
         * A(n) - n-ta rata
         * n - n-ty miesiąc spłaty
         */


    }

    public void calculateData(){
        delta = b*b - 4*a*c;

        if (delta < 0 ) numberOfElements = 0;

    }

}
