public class DemoSomeFuncDiffObject {

    public static void main(String[] args) {
        SomeFunctionDiffObject<String, Integer> stringToInteger;

        stringToInteger = (strIn) -> {
            int result = Integer.parseInt(strIn);
            
            return result;
        };

        System.out.println("stringToInteger.func(\"10\") = " + stringToInteger.func("10"));
        
        
        SomeFunctionDiffObject<String, Double> stringToDouble = (strIn) -> {
            return Double.parseDouble(strIn);
            
        };
        System.out.println("stringToDouble.func(33.45) = " + stringToDouble.func("33.45"));
    }
}

