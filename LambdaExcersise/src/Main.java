import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;

        System.out.println(myNumber.getValue());

        myNumber = () -> Math.random()*100;

        System.out.println(myNumber.getValue());
        System.out.println();

        NumericTest isEven = (n) -> (n % 2) == 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(isEven.test(i));
        }

        NumericTest isNonNeg = (n) -> n >= 0;

        NumericTest2 isFactor = (n, d) -> n % d == 0;

        System.out.println(isFactor.test(10, 2));

        \\

    }
}
