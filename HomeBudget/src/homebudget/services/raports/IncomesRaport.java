package homebudget.services.raports;

import homebudget.model.data.repository.Incomes;
import homebudget.model.income.Income;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Set;
import java.util.TreeSet;

public class IncomesRaport {

    public static void perMonth(Incomes incomes) {
        System.out.println("Raport przychodów");
        System.out.println("Rok  | miesiac | kwota | średnia ");
        System.out.println("---------------------------------");
        generateView(incomes);

    }


    private static void generateView(Incomes incomes) {

        Set<LocalDate> dateOfIncome = new TreeSet<>();

        for (Income income : incomes.getIncomes()
        ) {
            dateOfIncome.add(LocalDate.of(income.getIncomeDateTime().getYear(),
                    income.getIncomeDateTime().getMonth(),
                    1));
        }


        for (LocalDate localDate : dateOfIncome
        ) {

                double sumOfIncomes = 0;
                double sumOfIncomesAverage = 0;

                for (Income income : incomes.getIncomes()
                ) {
                    if (income.getIncomeDateTime().getYear() == localDate.getYear() &&
                            income.getIncomeDateTime().getMonth().equals(localDate.getMonth())) {

                        sumOfIncomes += income.getAmmount();

                    }

                    LocalDateTime dateMin = LocalDateTime.of(localDate.getYear(),
                            localDate.getMonth().minus(2),
                            1, 0, 0, 0);
                    LocalDateTime dateMax = dateMin.plusMonths(2);

                    if (income.getIncomeDateTime().isAfter(dateMin)
                            && income.getIncomeDateTime().isBefore(dateMax)) {

                        sumOfIncomesAverage += income.getAmmount();
                    }
                }

                System.out.println(localDate.getYear() + " | " + localDate.getMonth() + "  | "
                        + sumOfIncomes + " | " + sumOfIncomesAverage / 2);



        }
    }


}
