package homebudget.userinterface;

import homebudget.controller.ControlExpense;
import homebudget.controller.ControlIncome;
import homebudget.model.categories.ExpenseCategory;
import homebudget.model.categories.IncomeCategory;
import homebudget.model.data.repository.Expenses;
import homebudget.model.data.repository.Incomes;
import homebudget.model.expense.Expense;
import homebudget.model.householders.Householder;
import homebudget.model.income.Income;
import homebudget.services.modify.ExpensesModify;
import homebudget.services.modify.IncomesModify;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DataFromUser {


    public static void expense(Expenses expenses){

        try {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj kwotę wydatku");
            double ammount = Double.parseDouble(scanner.nextLine());

            System.out.println("Podj datę wydatku w formacie rrrr-mm-ddTgg:mm:ss");
            LocalDateTime expenseDateTime = LocalDateTime.parse(scanner.nextLine());

            System.out.println("Kto dodaje ten wpis? Wpisz swoje imię zgodnie z listą:");
            for (Householder householder: Householder.values()
            ) {
                System.out.println(householder);
            }
            Householder householder = Householder.valueOf(scanner.nextLine().toUpperCase());

            System.out.println("Podaj kategorię wydatku. Wpisz zgodnie z listą:");
            for (ExpenseCategory expenseCategory: ExpenseCategory.values()
            ) {
                System.out.println(expenseCategory);
            }

            ExpenseCategory expenseCategory = ExpenseCategory.valueOf(scanner.nextLine().toUpperCase());

            Expense expense = new Expense(expenseDateTime, expenseCategory, householder,ammount);

            ExpensesModify.add(expenses, expense);

        } catch (Exception ex){
            System.out.println("Podałeś nieprawidłową wartość. Spróbuj jeszcze raz");
            ControlExpense.tryAgain(expenses);
            //ex.printStackTrace();
        }

    }

    public static void income(Incomes incomes){


        try {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Podaj kwotę przychodu");
            double ammount = Double.parseDouble(scanner.nextLine());


            System.out.println("Podj datę przychodu w formacie rrrr-mm-ddTgg:mm:ss");
            LocalDateTime incomeDateTime = LocalDateTime.parse(scanner.nextLine());

            System.out.println("Kto dodaje ten wpis? Wpisz swoje imię zgodnie z listą:");
            for (Householder householder: Householder.values()
            ) {
                System.out.println(householder);
            }
            Householder householder = Householder.valueOf(scanner.nextLine().toUpperCase());


            System.out.println("Podaj kategorię przychodu. Wpisz zgodnie z listą:");
            for (IncomeCategory incomeCategory: IncomeCategory.values()
            ) {
                System.out.println(incomeCategory);
            }

            IncomeCategory incomeCategory = IncomeCategory.valueOf(scanner.nextLine().toUpperCase());

            Income income = new Income(incomeDateTime, incomeCategory, householder,ammount);
            IncomesModify.add(incomes, income);

        }catch (Exception ex){
            System.out.println("Podałeś nieprawidłową wartość. Spróbuj jeszcze raz");
            ControlIncome.tryAgain(incomes);
            //ex.printStackTrace();
        }

    }


}
