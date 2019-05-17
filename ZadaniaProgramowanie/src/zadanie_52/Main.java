package zadanie_52;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Trinomial trinomial = new Trinomial();

        trinomial.readData();
        trinomial.calculateData();
        trinomial.showData();
    }
}
