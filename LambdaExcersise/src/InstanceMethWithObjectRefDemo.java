public class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] vals, MyFunc2<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;

        }
        return count;
    }

    public static void main(String[] args) {

        int count;

        HighTemp[] weekDayHighs = {new HighTemp(32), new HighTemp(27), new HighTemp(32),
                new HighTemp(32), new HighTemp(30), new HighTemp(30), new HighTemp(33), new HighTemp(26),
                new HighTemp(25)};

        count = counter(weekDayHighs, HighTemp::someTemp, new HighTemp(30));
        System.out.println(count + " dni miały temperaturę równą 30 stopni");

        HighTemp[] weekDayHighs2 = {new HighTemp(16), new HighTemp(6), new HighTemp(17),
                new HighTemp(10), new HighTemp(11), new HighTemp(10), new HighTemp(-1), new HighTemp(9)};

        count = counter(weekDayHighs2, HighTemp::someTemp, new HighTemp(10));
        System.out.println(count + " dni miały temperaturę równą 10 stopni");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(10));
        System.out.println(count + " dni miały temperaturę niższą niż 10 stopni");

    }
}
