package homebudget.userinterface;

import homebudget.model.categories.ExpenseCategory;
import homebudget.model.categories.IncomeCategory;
import homebudget.model.data.repository.Expenses;
import homebudget.model.data.repository.Incomes;
import homebudget.model.expense.Expense;
import homebudget.model.householders.Householder;
import homebudget.model.income.Income;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootStrap {


    /**
     * Generowanie przykladowych danych
     */

    public static void generateData(Expenses expenses, Incomes incomes){

        Income income1 = new Income(LocalDateTime.parse("2019-04-01T16:00:00"), IncomeCategory.UMOWA_O_PRACE, Householder.ANDRZEJ, 5600.00);
        Income income2 = new Income(LocalDateTime.parse("2019-05-02T16:00:00"), IncomeCategory.B2B, Householder.ANDRZEJ, 6600.00);
        Income income3 = new Income(LocalDateTime.parse("2019-06-07T16:00:00"), IncomeCategory.UMOWA_O_PRACE, Householder.ANDRZEJ, 4600.00);
        Income income4 = new Income(LocalDateTime.parse("2019-06-08T16:00:00"), IncomeCategory.UMOWA_O_PRACE, Householder.ANDRZEJ, 5600.00);
        Income income5 = new Income(LocalDateTime.parse("2012-03-07T16:00:00"), IncomeCategory.INNE, Householder.ANDRZEJ, 3000.00);
        Income income6 = new Income(LocalDateTime.parse("2019-07-08T16:00:00"), IncomeCategory.UMOWA_O_PRACE, Householder.ANDRZEJ, 5600.00);


        Expense expense1 = new Expense(LocalDateTime.parse("2013-04-02T12:00:00"), ExpenseCategory.AUTO, Householder.ANDRZEJ, 600);
        Expense expense2 = new Expense(LocalDateTime.parse("2019-05-02T12:00:00"), ExpenseCategory.JEDZENIE, Householder.ANDRZEJ, 500);
        Expense expense3 = new Expense(LocalDateTime.parse("2019-06-02T12:00:00"), ExpenseCategory.OPLATY, Householder.ANDRZEJ, 400);
        Expense expense4 = new Expense(LocalDateTime.parse("2019-05-02T12:00:00"), ExpenseCategory.OSOBISTE, Householder.ANDRZEJ, 670);
        Expense expense5 = new Expense(LocalDateTime.parse("2019-05-02T12:00:00"), ExpenseCategory.AUTO, Householder.ANDRZEJ, 600);
        Expense expense6 = new Expense(LocalDateTime.parse("2019-06-02T12:00:00"), ExpenseCategory.REMONT, Householder.ANDRZEJ, 600);
        Expense expense7 = new Expense(LocalDateTime.parse("2019-07-02T12:00:00"), ExpenseCategory.UBRANIA, Householder.ANDRZEJ, 500);
        Expense expense8 = new Expense(LocalDateTime.parse("2019-03-02T12:00:00"), ExpenseCategory.AUTO, Householder.ANDRZEJ, 400);
        Expense expense9 = new Expense(LocalDateTime.parse("2019-04-02T12:00:00"), ExpenseCategory.JEDZENIE, Householder.ANDRZEJ, 500);
        Expense expense10 = new Expense(LocalDateTime.parse("2019-06-02T12:00:00"), ExpenseCategory.AUTO, Householder.ANDRZEJ, 900);

        List<Income> incomeList = new ArrayList<>();
        Collections.addAll(incomeList, income1, income2, income3, income4, income5, income6);
        incomes.setIncomes(incomeList);


        List<Expense> expenseList = new ArrayList<>();
        Collections.addAll(expenseList, expense1, expense2, expense3, expense4, expense5, expense6, expense7, expense8, expense9, expense10);
        expenses.setExpenses(expenseList);

    }


}
