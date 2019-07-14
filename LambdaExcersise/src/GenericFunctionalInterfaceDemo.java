public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                result +=str.charAt(i);

            }
            return result;
        };

        System.out.println("lambda po odwróceniu " + reverse.func("lambda"));


        SomeFunc<Integer> factorial = integer -> {
            int result = 1;
            for (int i = 1; i <= integer ; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Silnia liczby 3 wynosi " + factorial.func(3));
        System.out.println("Silnia liczby 5 wynosi " + factorial.func(5));
    }

}
