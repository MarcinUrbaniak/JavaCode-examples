import javax.print.DocFlavor;

public class HelloWorld {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        boolean b = false;

        System.out.println("Test1: " + b);

        b = true;

        System.out.println("Test2: " + b);

        int  a = 1270000000;
        int wynik = (a * 500000000);

        System.out.println(wynik);

        System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.print('\u005a');

        char c = '\r';
        System.out.println('\u221e');
        System.out.println();

        String string = new String();
        string = "To jest napis";

        System.out.println(string);

        int[] inTab = new int[3];
        inTab[0] = 2;
        inTab[1] = 5;
        inTab[2] = 8;


        String[] napisy = new String[2];

        napisy[0] = "pierwszy napis";
        napisy[1] = "drugi napis";

        System.out.println(napisy[0]);
        System.out.println(napisy[1]);

        float[] floTab = new float[5];

        float[] floTab1 = {23f, 54f};

        int[] intTab1 = new int[]{5, 4, 58, 36};

        System.out.println(floTab1[0]);
        System.out.println(intTab1[3]);

        System.out.println(intTab1.length);

        int[] intTab3 = {7,5,14};
        System.out.println(intTab3);

        String[][] strTab2 = {
                {"4","15", "34"},
                {"napis", "inny napis", "trzeci napis"}
        };



        System.out.println(strTab2[1][2]);

        System.out.println(5/2);

        double d = 12.4;
        double e = 43.3;
        double f;

        f = e % d;
        System.out.println(f);

        int g = 5;
        int h = 2;
        //@TODO: mnożąc przez 1.0 zmieniamy typ wyniku na double (bez tego mnożenia mamy w wyniku dzielenia liczb całkowitych
        //również liczbę całkowitą

        double wynik1 = 1.0 * g / h;

        System.out.println(wynik1);

        //@TODO: Różnica między postinkrementacją i preinkrementacją
        g = 10;
        h = 3 * g++;
        System.out.println(h);

        g = 10;
        h = 3 * ++g;

        System.out.println(h);

        int i = 12;
        boolean isDigit = i > 13 && i < 23;

        boolean isNotDigit = !isDigit;

        System.out.println(isDigit + " " + isNotDigit);


    }

}


