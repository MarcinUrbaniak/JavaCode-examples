import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Excercise2 {
    public static void main(String[] args) {

        String text1 = new String("Test");
        String text2 = "Test";
        String text3 = "Te" + "st";

        if (text1.equals(text2)) {
            System.out.println("text1 i text2 są sobie równe");
        }
        if (text1.equals(text3)) {
            System.out.println("text1 i text3 są sobie równe");
        }
        if (text2.equals(text3)) {
            System.out.println("text2 i text3 są sobie równe");
        }
        if (text2.equals(text3)) {
            System.out.println("text2 i text3 są sobie równe");
        }

        if(text1.equalsIgnoreCase(text2)){
            System.out.println("są sobie równe t1 i t2 ze zignorowanymi ");
        }

        String text4 = "hula";
        String text5 = text4.replace("h", "c");

        System.out.println(text5);
        System.out.println(text4);

//budowa złączonych wartości przez metodę append w StringBuilder jest bardziej optymalna
        StringBuilder example = new StringBuilder().append("Ala").append(" ma").append(" kota.");
        String example2 = "Ala " + "ma " + "kota.";
        System.out.println(example);
        System.out.println(example2);

        System.out.println(example.indexOf("la"));
        System.out.println(example.indexOf("ro"));
        System.out.println(example.lastIndexOf("a"));
        boolean startWith = example.toString().startsWith("p");
        System.out.println(startWith);
        System.out.println(example.toString().endsWith("."));


        String example4 = "W szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie";

        int start = example4.indexOf("ch");
        int end = example4.indexOf("nie", 20);
        String substring = example4.substring(start, end +3 );

        System.out.println(substring);
//compareTo http://www.w3big.com/pl/java/java-string-compareto.html
        int result = example4.compareTo(text1);
        System.out.println(result);
        System.out.println(text1.compareTo(example4));
        System.out.println(example4.charAt(5));
        System.out.println(example4.length());
        System.out.println(example4.trim());
        System.out.println(example4.toLowerCase());
        System.out.println(example4.toUpperCase());

//TODO: Wyrażenia regularne


        String text = "Hello World, it's world od RegExp";

        System.out.println(text.matches(".*World.*"));
        System.out.println(text.matches("^Hello.*"));
        System.out.println(text.matches(".*RegExp$"));
        System.out.println(text.matches(".*RegExp\\s+$"));
        System.out.println(text.matches(".*"));


        System.out.println(text.replace("World","Swiece" ));


        String text9 = "00-950";
        System.out.println(text9.matches("\\d{2}-\\d{3}"));

        String text10 = "imiena.zwisko@gmail.com";
        System.out.println(text10.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"));

        String text11 = "Samochod odjezdza o 15:45";
        System.out.println(text11.replaceAll("\\d{2}:\\d{2}", "14:34"));
        System.out.println(text11.replaceAll("\\d{2}:\\d{2}", "14:36"));



    }

}
