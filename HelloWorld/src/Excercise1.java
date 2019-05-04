import sun.java2d.pipe.AAShapePipe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class Excercise1 {
    public static void main(String[] agr) {

        int[] newTab = new int[5];

        for (int i = 0; i <= newTab.length - 1; i++) {
            newTab[i] = i;
        }

        for (int i = 0; i <= newTab.length - 1; i++) {
            System.out.print(newTab[i] + ", ");
        }


        int x = 7;

        switch (x) {
            case 4:
                System.out.println(x);
                break;
            case 5:
                System.out.println("trafiles czwórkę");
                break;
            case 7:
                System.out.println("trafiles siódemkę ");
                break;
            default:
                System.out.println("nie znalezlismy wartosci x");
        }

        if (x > 5) {
            System.out.println("x większe od pięciu");
        } else {
            System.out.println("x mniejsze lub równe pięć");
        }


        do {
            System.out.println("pojawiam się przynajmniej raz");
            x--;
        } while (x > 0);

        x = 5;
        System.out.println("pętla while");
        while (x > 0) {
            System.out.println(x);
            x--;
        }

        x = 12;

        do {
            System.out.println("To będzie jeden napis");
        } while (x == 13);

        int y = 0;

//@TODO: Wypełnianie tablicy liczbami nieparzystymi
        System.out.println("tu wynik:");
        int[] newTab1 = new int[10];

        for (int i = 0; i < newTab1.length; i++) {
            if (i % 2 == 0) {
                newTab1[i] = i + 1;
            } else {
                newTab1[i] = i;
            }


        }

        System.out.println(Arrays.toString(newTab1));
//@TODO: Wypełnianie tablicy liczbami parzystymi

        int[] newTab2 = new int[10];

        for (int i = 0; i < newTab2.length; i++) {
            if (i % 2 == 0) {
                newTab2[i] = i;
            } else {
                newTab2[i] = -1;
            }
        }


        System.out.println(Arrays.toString(newTab2));

        System.out.println("tablica wartości losowych");
        int[] newTab3 = new int[10];


//TODO: Generowanie liczb pseudolosowych

        for (int i = 0; i < newTab3.length; i++) {
            Random randomGenerator = new Random();
            //w komentarzu moje rozwiązanie
            //int nextInt = randomGenerator.nextInt(15);
            //if (nextInt >= 5){
            //    newTab3[i] = nextInt;
            //}

            newTab3[i] = 5 + randomGenerator.nextInt(10);
        }
        System.out.println(Arrays.toString(newTab3));

//TODO: Kopiowanie danych pomiędzy tablicami
        System.out.println("Kopiowanie danych pomiędzy tablicami");

        int[] newTab4 = new int[10];
        int[] newTab5 = new int[10];

        for (int i = 0; i < 10; i++) {
            Random randomGenerator = new Random();
            newTab4[i] = randomGenerator.nextInt(20);
        }
        System.out.println(Arrays.toString(newTab4));

        System.arraycopy(newTab4, 0, newTab5, 0, 10);

        System.out.println(Arrays.toString(newTab5));

//TODO: Wyliczenie min, max, średnia arytmetyczna
        System.out.println("Wyliczenie min, max, średnia arytmetyczna");

        int[] newTab6 = {20, 10, 13, 30, 100, 20, 102, 4, 10, 17};

        System.out.println(Arrays.toString(newTab6));
        int min = newTab6[0];
        int max = newTab6[0];
        double sum = 0;


        for (int i = 0; i < newTab6.length; i++) {
            sum += newTab6[i];
            if (min > newTab6[i]) {
                min = newTab6[i];
            } else if (max < newTab6[i]) {
                max = newTab6[i];
            }

        }
        double avg = sum / newTab6.length;
        System.out.println(min + " " + max + " " + sum + " " + avg);

        //TODO: Sortowanie bąbelkowe na podstawie algorytmu z ćwiczeń
        //stworzenie tablicy losowej liczb całkowitych

        int[] tabRandom = new int[10];


        for (int i = 0; i < tabRandom.length; i++) {
            Random randomGenerator = new Random();
            tabRandom[i] = randomGenerator.nextInt(100);
        }

        System.out.print("Tablica nieposortowana: ");
        System.out.println(Arrays.toString(tabRandom));

        //Sortowanie bąbelkowe funkcja - rosnąco

        for (int i = 0; i < tabRandom.length - 1; i++) {
            for (int j = 0; j < tabRandom.length - 1 - i; j++) {
                if (tabRandom[j] > tabRandom[j + 1]) {
                    int temp = tabRandom[j];
                    tabRandom[j] = tabRandom[j + 1];
                    tabRandom[j + 1] = temp;

                }
            }
        }
        System.out.print("tablica posortowana rosnąco: ");
        System.out.println(Arrays.toString(tabRandom));

        //TODO: sortowanie bąbelkowe malejąco

        for (int i = 0; i < tabRandom.length - 1; i++) {
            for (int j = 0; j < tabRandom.length - 1 - i; j++) {
                if (tabRandom[j] < tabRandom[j + 1]) {
                    int temp = tabRandom[j];
                    tabRandom[j] = tabRandom[j + 1];
                    tabRandom[j + 1] = temp;
                }
            }
        }
        System.out.print("tablica posortowana malejąco: ");
        System.out.println(Arrays.toString(tabRandom));


        //TODO: tablica posortowana rosnąco ale zawierająca tylko liczby parzyste

        int[] arr = new int[tabRandom.length];

        for (int i = 0; i < tabRandom.length - 1; i++) {
            for (int j = 0; j < tabRandom.length - 1 - i; j++) {
                if (tabRandom[j] > tabRandom[j + 1]) {
                    int temp = tabRandom[j];
                    tabRandom[j] = tabRandom[j + 1];
                    tabRandom[j + 1] = temp;
                }
            }
        }
        int evenCounter = 0;
        for (int i = 0; i < tabRandom.length; i++) {
            if (tabRandom[i] % 2 == 0) {
                arr[i] = tabRandom[i];
                evenCounter++;
            } else {
                arr[i] = -1;
            }
        }

        int[] evenTab = new int[evenCounter];
        int lastEvenIndex = 0;

        for (int i = 0; i < tabRandom.length; i++) {
            if (tabRandom[i] % 2 == 0) {
                evenTab[lastEvenIndex] = tabRandom[i];
                lastEvenIndex++;
            }
        }


        System.out.print("tablica zawierająca tylko liczby parzyste: ");
        System.out.println(Arrays.toString(evenTab));

        System.out.println();
        System.out.println("sortowanie przez wstawianie");

        for (int i = 0; i < tabRandom.length; i++) {
            Random nextRandom = new Random();
            tabRandom[i] = nextRandom.nextInt(100);

        }
//Todo: Sortowanie przez wstawianie - rozpisać sobie pierwsze kroki
        System.out.println(Arrays.toString(tabRandom));
        int  sorted;
        for (int i = 1; i < tabRandom.length; i++) {
//stworzenie tablicy posortowanej sorted
            sorted = tabRandom[i];

            while (i > 0 && tabRandom[i - 1] > sorted) {
                tabRandom[i] = tabRandom[i - 1];
                i--;
            }
            tabRandom[i] = sorted;
        }
        System.out.println(Arrays.toString(tabRandom));

    }
}
