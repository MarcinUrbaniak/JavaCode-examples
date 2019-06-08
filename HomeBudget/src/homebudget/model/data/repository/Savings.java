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


    public static void calculate(Incomes incomes, Expenses expenses){

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

        Map<LocalDate, Double> savingsPerMonth = new HashMap<>();

        for (LocalDate savingDate: savingsDate
             ) {

            double sumOfIncomesPerMonth = 0;
            for (Income income: incomes.getIncomes()
                 ) {
                LocalDateTime incomeDate = income.getIncomeDateTime();

                if(savingDate.getYear() == incomeDate.getYear() && savingDate.getMonth().equals(incomeDate.getMonth())){
                    sumOfIncomesPerMonth += income.getAmmount();
                }
            }

            double sumOfExpensesPerMonth =0;
            for (Expense expense: expenses.getExpenses()
                 ) {
                LocalDateTime expenseDate = expense.getExpenseDateTime();

                if(savingDate.getYear() == expenseDate.getYear() && savingDate.getMonth().equals(expenseDate.getMonth())){
                    sumOfExpensesPerMonth += expense.getAmmount();
                }
            }


//            System.out.println("savingDate = " + savingDate);
//            System.out.println("sumOfIncomesPerMonth = " + sumOfIncomesPerMonth);
//            System.out.println("sumOfExpensesPerMonth = " + sumOfExpensesPerMonth);

            savingsPerMonth.put(savingDate,sumOfIncomesPerMonth - sumOfExpensesPerMonth);

        }

        System.out.println("savingsPerMonth = " + savingsPerMonth);

    }
}
