public class GenericMethodRefDemo {

    static <T> int myOp(MyFunc3<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 5, 6};
        String[] strings = {"Jednen", "Dwa", "Trzy", "Dwa"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);

        System.out.println("Tablica vals zawiera " + count + " wartości 4.");

        count = myOp(MyArrayOps::<String>countMatching, strings, "Dwa");

        System.out.println("Tablica strs zawiera " + count + " łańcuchy \"Dwa\".");



    }
}
