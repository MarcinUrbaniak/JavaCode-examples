package homebudget.services.raports;

import homebudget.model.categories.ExpenseCategory;
import homebudget.model.data.repository.Expenses;
import homebudget.model.expense.Expense;

import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.stream.Stream;

public class ExpensesRaport {


    public static void perMonthAndCategory(Expenses expenses){

        Set<Integer> yearOfExpense = new TreeSet<>();
        Set<Month> monthOfExpense = new TreeSet<>();

        for (Expense expense: expenses.getExpenses()
             ) {
            yearOfExpense.add(expense.getExpenseDateTime().getYear());
            monthOfExpense.add(expense.getExpenseDateTime().getMonth());
        }



        System.out.println("monthOfExpense = " + monthOfExpense);




        System.out.println("Rok | miesiac | kategoria | kwota ");
    }

}
