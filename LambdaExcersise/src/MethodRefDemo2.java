public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Wyraźenia lambda zwiększają możliwości javy";
        String ouStr;
        MyStringOps2 myStringOps2 = new MyStringOps2();

        ouStr = stringOp(myStringOps2::strReverse, inStr);

        System.out.println("inStr = " + inStr);
        System.out.println("ouStr = " + ouStr);

    }

}
