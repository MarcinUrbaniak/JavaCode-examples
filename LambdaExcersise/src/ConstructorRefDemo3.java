public class ConstructorRefDemo3 {

    static <R,T> R myClassFactory(MyFunc6<R,T> cons, T v ){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc6<MyClass3<Double>, Double> myClassCons = MyClass3<Double>::new;

        MyClass3<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("Zapisana wartość to: " + mc.getVal());

        MyFunc6<MyClass4, String> myClassCons2 = MyClass4::new;

        MyClass4 mc4 = myClassFactory(myClassCons2, "Lambda");

        System.out.println("Łańcuch zmiennej mc4 " + mc4.getString());
    }
}
