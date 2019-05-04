import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        List<String> birds = new ArrayList<>();
        List<String> onlyBirds = new ArrayList<>();

        Collections.addAll(birds, "Kaczka", "Bocian", "Wróbel","Sokół", "Dzięcioł", "Kura");
        Collections.addAll(animals, "Pies", "Kot", "Krowa","Kura", "Baran", "Owca", "Dzięcioł");


        onlyBirds = Animals.animalsCheck(animals, birds);


        for (String strings:onlyBirds
             ) {
            System.out.println(strings);

        }






    }

}
