public class ConstructorRefDemo {

    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass1::new;
        MyClass1 mc = myClassCons.func(100);

        System.out.println("Zapisane wartości to " + mc.getVal());

    }
}
