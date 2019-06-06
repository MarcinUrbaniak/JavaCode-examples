package homebudget.services.modify;

import homebudget.model.data.repository.Expenses;
import homebudget.model.expense.Expense;

public class ExpensesModify {




    public static void add(Expenses expenses, Expense expense){

        expenses.getExpenses().add(expense);
    }


    public static boolean remove(Expenses expenses, Expense expense){

        if(expenses.getExpenses().contains(expense)){
            expenses.getExpenses().remove(expense);

            return true;
        }

        return false;

    }


}
