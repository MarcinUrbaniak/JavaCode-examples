package homebudget.services.raports;

import homebudget.model.data.repository.Incomes;
import homebudget.model.income.Income;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Set;
import java.util.TreeSet;

public class IncomesRaport {

    public static void perMonth(Incomes incomes) {
        System.out.println("Rok  | miesiac | kwota | średnia ");
        System.out.println("---------------------------------");
        generateView(incomes);

    }


    private static void generateView(Incomes incomes) {
        Set<Integer> yearOfIncome = new TreeSet<>();
        Set<Month> monthOfIncome = new TreeSet<>();

        for (Income income : incomes.getIncomes()
        ) {
            yearOfIncome.add(income.getIncomeDateTime().getYear());
            monthOfIncome.add(income.getIncomeDateTime().getMonth());
        }


        for (Integer year : yearOfIncome
        ) {
            for (Month month : monthOfIncome
            ) {
                double sumOfIncomes = 0;
                double sumOfIncomesAverage = 0;

                for (Income income : incomes.getIncomes()
                ) {
                    if (income.getIncomeDateTime().getYear() == year &&
                            income.getIncomeDateTime().getMonth().equals(month)) {

                        sumOfIncomes += income.getAmmount();

                    }

                    LocalDateTime dateMin = LocalDateTime.of(year, month.minus(2), 1, 0, 0, 0);
                    LocalDateTime dateMax = dateMin.plusMonths(2);

                    if (income.getIncomeDateTime().isAfter(dateMin) && income.getIncomeDateTime().isBefore(dateMax)) {
                        sumOfIncomesAverage += income.getAmmount();
                    }
                }

                System.out.println(year + " | " + month + "  | " + sumOfIncomes + " | " + sumOfIncomesAverage / 2);


            }
        }
    }


}
