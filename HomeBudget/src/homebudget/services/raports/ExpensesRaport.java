package homebudget.services.raports;

import homebudget.model.categories.ExpenseCategory;
import homebudget.model.data.repository.Expenses;
import homebudget.model.expense.Expense;
import homebudget.model.householders.Householder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;


public class ExpensesRaport {


    public static void perMonthAndCategory(Expenses expenses) {


        System.out.println("Rok  | miesiac | kategoria | kwota ");
        System.out.println("-----------------------------------");
        generateView(expenses, "byCategory");
    }

    public static void perMonthAndHouseholder(Expenses expenses) {


        System.out.println("Rok  | miesiac | osoba | kwota | średnia ");
        System.out.println("-----------------------------------");
        generateView(expenses, "byHouseholder");
    }


    private static void generateView(Expenses expenses, String kindOfRaport) {
        Set<Integer> yearOfExpense = new TreeSet<>();
        Set<Month> monthOfExpense = new TreeSet<>();

        for (Expense expense : expenses.getExpenses()
        ) {
            yearOfExpense.add(expense.getExpenseDateTime().getYear());
            monthOfExpense.add(expense.getExpenseDateTime().getMonth());
        }


        for (Integer year : yearOfExpense
        ) {
            for (Month month : monthOfExpense
            ) {

                if(kindOfRaport.equals("byCategory")){

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
                else if(kindOfRaport.equals("byHouseholder")){
                    for (Householder householder : Householder.values()) {
                        double sumOfExpenses = 0;
                        double sumOfExpensesAverage = 0;
                        for (Expense expense : expenses.getExpenses()
                        ) {
                            int yearFromExpense = expense.getExpenseDateTime().getYear();
                            Month monthFromExpense = expense.getExpenseDateTime().getMonth();

                            if (yearFromExpense == year && monthFromExpense.equals(month) &&
                                    expense.getHouseholder().equals(householder)) {

                                sumOfExpenses += expense.getAmmount();

                            }

                            LocalDateTime dateMin = LocalDateTime.of(year, month.minus(2),1, 0,0,0);
                            LocalDateTime dateMax = dateMin.plusMonths(2);

                            if(expense.getExpenseDateTime().isAfter(dateMin) && expense.getExpenseDateTime().isBefore(dateMax)) {
                                sumOfExpensesAverage += expense.getAmmount();
                            }



                        }

                        System.out.println(year + " | " + month + "  | " + householder + "   | "
                                + sumOfExpenses + " | " + sumOfExpensesAverage/2);


                    }


                }
            }
        }
    }

}
