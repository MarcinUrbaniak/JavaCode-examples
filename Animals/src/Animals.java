import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Animals {

    private  List<String> birds;
    private  List<String> animals;

    public static List<String> animalsCheck(List<String> animals, List<String> birds){
        animals.retainAll(birds);
        Collections.sort(animals);

        return animals;
    }

}
