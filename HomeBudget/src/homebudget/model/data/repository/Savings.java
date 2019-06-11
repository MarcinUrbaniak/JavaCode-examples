package homebudget.model.data.repository;

import homebudget.model.expense.Expense;
import homebudget.model.income.Income;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Savings {

    Map<LocalDate, Double> savingsPerMonth = new HashMap<>();
    Map<LocalDate, Double> savingsAverageTwoMonthBefore = new HashMap<>();

    public void calculate(Incomes incomes, Expenses expenses){

        Set<LocalDate> savingsDate = getSavingDates(incomes, expenses);

//        Map<LocalDate, Double> savingsPerMonth = new HashMap<>();
//        Map<LocalDate, Double> savingsAverageTwoMonthBefore = new HashMap<>();

        for (LocalDate savingDate: savingsDate
             ) {

            double sumOfIncomesPerMonth = 0;
            double sumOfIncomesAverage = 0;

            for (Income income: incomes.getIncomes()
                 ) {
                LocalDateTime incomeDate = income.getIncomeDateTime();
                LocalDateTime dateMin = LocalDateTime.of(savingDate.getYear(),savingDate.getMonth().minus(2),1,0,0,0);
                LocalDateTime dateMax = dateMin.plusMonths(2);

                if(savingDate.getYear() == incomeDate.getYear() && savingDate.getMonth().equals(incomeDate.getMonth())){
                    sumOfIncomesPerMonth += income.getAmmount();
                }
                if(incomeDate.isAfter(dateMin) && incomeDate.isBefore(dateMax)){
                    sumOfIncomesAverage += income.getAmmount();
                }
            }

            double sumOfExpensesPerMonth = 0;
            double sumOfExpensesAverage = 0;

            for (Expense expense: expenses.getExpenses()
                 ) {
                LocalDateTime expenseDate = expense.getExpenseDateTime();
                LocalDateTime dateMin = LocalDateTime.of(savingDate.getYear(),savingDate.getMonth().minus(2),1,0,0,0);
                LocalDateTime dateMax = dateMin.plusMonths(2);


                if(savingDate.getYear() == expenseDate.getYear() && savingDate.getMonth().equals(expenseDate.getMonth())){
                    sumOfExpensesPerMonth += expense.getAmmount();
                }

                if(expenseDate.isAfter(dateMin) && expenseDate.isBefore(dateMax)){
                    sumOfExpensesAverage += expense.getAmmount();
                }

            }



            savingsPerMonth.put(savingDate,sumOfIncomesPerMonth - sumOfExpensesPerMonth);
            savingsAverageTwoMonthBefore.put(savingDate, (sumOfIncomesAverage - sumOfExpensesAverage)/2);

        }


    }


    public Map<LocalDate, Double> getSavingsPerMonth() {
        return savingsPerMonth;
    }

    public Map<LocalDate, Double> getSavingsAverageTwoMonthBefore() {
        return savingsAverageTwoMonthBefore;
    }

    private static Set<LocalDate> getSavingDates(Incomes incomes, Expenses expenses) {
        Set<LocalDate> savingsDate = new TreeSet<>();

        for (Income income: incomes.getIncomes()
             ) {
            savingsDate.add(LocalDate.of(income.getIncomeDateTime().getYear(),income.getIncomeDateTime().getMonth(),1));
        }

        for (Expense expennse: expenses.getExpenses()
             ) {
            savingsDate.add(LocalDate.of(expennse.getExpenseDateTime().getYear(), expennse.getExpenseDateTime().getMonth(), 1));
        }

        for (LocalDate date: savingsDate
             ) {

        }
        return savingsDate;
    }
}
