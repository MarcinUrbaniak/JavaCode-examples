public class LambdaAsAgrumentsDemo {
    static String stringOp(StringFunc stringFunc, String s){
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String strIn ="Wyrażenia lambda rozszerzają możliwości Javy";
        String strOut;

        System.out.println("Łańcuch wejściowy: " + strIn);

        strOut = stringOp((str) -> str.toUpperCase(),strIn);

        System.out.println("Łańcuch zapisany wielkimi literami " + strOut);

        strOut = stringOp((str) ->{
            String result = "";
            for (int i = 0; i < str.length() ; i++) {
                if(str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        }, strIn);

        System.out.println("Łańcuch bez znaków odstępu " + strOut);
    }
}
