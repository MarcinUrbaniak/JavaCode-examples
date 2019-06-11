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

        System.out.println("Raport wydatków wg kategorii");
        System.out.println("Rok  | miesiac | kategoria | kwota ");
        System.out.println("-----------------------------------");
        generateView(expenses, "byCategory");
    }

    public static void perMonthAndHouseholder(Expenses expenses) {

        System.out.println("Raport wydatków wg domownika");
        System.out.println("Rok  | miesiac | osoba | kwota | średnia ");
        System.out.println("------------------------------------------");
        generateView(expenses, "byHouseholder");
    }


    private static void generateView(Expenses expenses, String kindOfRaport) {

        Set<LocalDate> dateOfExpense = new TreeSet<>();

        for (Expense expense : expenses.getExpenses()
        ) {

            dateOfExpense.add(LocalDate.of(expense.getExpenseDateTime().getYear(),
                    expense.getExpenseDateTime().getMonth(),1));
        }


        for (LocalDate localDate : dateOfExpense
        ) {


                if(kindOfRaport.equals("byCategory")){
                    for (ExpenseCategory expenseCategory : ExpenseCategory.values()) {
                        double sumOfExpenses = 0;
                        for (Expense expense : expenses.getExpenses()
                        ) {
                            if (expense.getExpenseDateTime().getYear() == localDate.getYear() &&
                                    expense.getExpenseDateTime().getMonth().equals(localDate.getMonth()) &&
                                    expense.getExpenseCategory().equals(expenseCategory)) {

                                sumOfExpenses += expense.getAmmount();

                            }
                        }

                        System.out.println(localDate.getYear() + " | " + localDate.getMonth() + "  | " + expenseCategory + "   | "
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
                            LocalDateTime dateMin = LocalDateTime.of(localDate.getYear(), localDate.getMonth().minus(2),1, 0,0,0);
                            LocalDateTime dateMax = dateMin.plusMonths(2);

                            if (yearFromExpense == localDate.getYear() && monthFromExpense.equals(localDate.getMonth()) &&
                                    expense.getHouseholder().equals(householder)) {

                                sumOfExpenses += expense.getAmmount();

                            }

                            if(expense.getExpenseDateTime().isAfter(dateMin) && expense.getExpenseDateTime().isBefore(dateMax)) {
                                sumOfExpensesAverage += expense.getAmmount();
                            }



                        }

                        System.out.println(localDate.getYear() + " | " + localDate.getMonth() + "  | " + householder + "   | "
                                + sumOfExpenses + " | " + sumOfExpensesAverage/2);


                    }


                }

        }
    }

}
