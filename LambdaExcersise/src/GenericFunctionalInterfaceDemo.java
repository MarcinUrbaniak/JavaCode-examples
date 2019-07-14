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
    }
}
