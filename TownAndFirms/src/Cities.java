import java.util.ArrayList;
import java.util.List;

public class Cities {

    private List<City> cities = new ArrayList<>();

    public  void getCitiesWitchMaxCompanies (List<City> cities){
        //this.cities = cities;

        int i = 0;
        for (City city: cities
        ) {
            if (i < city.getCompany().size()){
                i = city.getCompany().size();
            }

        }
        System.out.println("Miasta z największą liczbą firm: ");
        for (City city: cities
        ) {
            if (city.getCompany().size()==i){
                System.out.println(city.getNameOfTown());
            }

        }

    }
}
