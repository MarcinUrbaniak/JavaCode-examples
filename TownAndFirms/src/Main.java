import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company(1995, 12, "Poldex", 47, 541257);
        Company company2 = new Company(2007, 04, "Wtosex", 33, 46465);
        Company company3 = new Company(2005, 02, "Srodex", 12, 1125);
        Company company4 = new Company(1993, 05, "Czwartex", 15, 2545);
        Company company5 = new Company(1938, 04, "Piatex", 3, 5531);


        City city1 = new City("Gdansk");
        City city2 = new City("Warszawa");
        City city3 = new City("Kraków");


        city1.setCompany(Arrays.asList(company1, company2));
        city2.setCompany(Arrays.asList(company3,company4));
        city3.setCompany(Arrays.asList(company5));

        List<City> cities = new ArrayList<>();
        Collections.addAll(cities, city1, city2, city3);

        //System.out.println(Cities.getCitiesWitchMaxCompanies(cities));


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
