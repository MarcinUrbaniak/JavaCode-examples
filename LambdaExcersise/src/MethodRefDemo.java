public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Wyrażenia lambda zwiększają możliwości Javy";
        String ouStr;

        ouStr = stringOp(MyStringOps::srtReverse, inStr);

        System.out.println("inStr = " + inStr);
        System.out.println("ouStr = " + ouStr);
    }
}
