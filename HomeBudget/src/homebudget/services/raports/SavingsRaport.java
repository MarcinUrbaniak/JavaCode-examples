package homebudget.services.raports;

import homebudget.model.data.repository.Expenses;
import homebudget.model.data.repository.Incomes;
import homebudget.model.data.repository.Savings;

import java.time.LocalDate;
import java.util.Set;

public class SavingsRaport {


    public static void genarate(Incomes incomes, Expenses expenses){

        Savings savings = new Savings();
        savings.calculate(incomes, expenses);

        Set<LocalDate> keySet = savings.getSavingsPerMonth().keySet();


        System.out.println("Raport oszczędności");
        System.out.println("Rok  | miesiąc | kwota | średnia ");
        System.out.println("---------------------------------");

        for (LocalDate key: keySet
        ) {
            System.out.println(key.getYear() + " | " + key.getMonth() + " | " + savings.getSavingsPerMonth().get(key)
                    + " | " + savings.getSavingsAverageTwoMonthBefore().get(key) );
        }

        
    }


}
