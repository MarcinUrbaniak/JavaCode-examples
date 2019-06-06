package homebudget.services.raports;

import homebudget.model.categories.ExpenseCategory;
import homebudget.model.data.repository.Expenses;
import homebudget.model.expense.Expense;
import homebudget.model.householders.Householder;

import java.time.Month;
import java.util.*;


public class ExpensesRaport {


    public static void perMonthAndCategory(Expenses expenses) {

        generateView(expenses, 0);
    }

    public static void perMonthAndHouseholder(Expenses expenses) {

        generateView(expenses, 1);
    }


    private static void generateView(Expenses expenses, int kindOfRaport) {
        Set<Integer> yearOfExpense = new TreeSet<>();
        Set<Month> monthOfExpense = new TreeSet<>();

        for (Expense expense : expenses.getExpenses()
        ) {
            yearOfExpense.add(expense.getExpenseDateTime().getYear());
            monthOfExpense.add(expense.getExpenseDateTime().getMonth());
        }


        System.out.println("Rok  | miesiac | kategoria | kwota ");
        System.out.println("-----------------------------------");

        for (Integer year : yearOfExpense
        ) {
            for (Month month : monthOfExpense
            ) {

                if(kindOfRaport == 0){

                    for (ExpenseCategory expenseCategory : ExpenseCategory.values()) {
                        double sumOfExpenses = 0;
                        for (Expense expense : expenses.getExpenses()
                        ) {
                            if (expense.getExpenseDateTime().getYear() == year &&
                                    expense.getExpenseDateTime().getMonth().equals(month) &&
                                    expense.getExpenseCategory().equals(expenseCategory)) {

                                sumOfExpenses += expense.getAmmount();

                            }
                        }

                        System.out.println(year + " | " + month + "  | " + expenseCategory + "   | "
                                + sumOfExpenses);


                    }
                }
                else if(kindOfRaport == 1){
                    for (Householder householder : Householder.values()) {
                        double sumOfExpenses = 0;
                        for (Expense expense : expenses.getExpenses()
                        ) {
                            int yearFromExpenses = expense.getExpenseDateTime().getYear();
                            Month monthFromExpenses = expense.getExpenseDateTime().getMonth();

                            if (yearFromExpenses == year && monthFromExpenses.equals(month) &&
                                    expense.getHouseholder().equals(householder)) {

                                sumOfExpenses += expense.getAmmount();
//pomysł aby zminenic warunek z porownywania roku i miesiaca na porównywanie czy dana data jest z danego
//przedziału
                            }
                        }

                        System.out.println(year + " | " + month + "  | " + householder + "   | "
                                + sumOfExpenses);


                    }


                }
            }
        }
    }

}
