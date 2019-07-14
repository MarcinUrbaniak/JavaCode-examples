public class VarCapture {
    public static void main(String[] args) {
        int num = 30;

        MyFunc myLambda = (n) -> {
            int v = num + n;

            return  v;
        };
        //zmienne z zewnątrz w lambdach są finalne lub praktycznie jak finalne - nie można wykonać na nich dodatkowych operacji
        System.out.println(myLambda.func(10));
    }
}
