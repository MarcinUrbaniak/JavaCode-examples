import homebudget.model.data.repository.Expenses;
import homebudget.model.data.repository.Incomes;

import homebudget.services.raports.ExpensesRaport;
import homebudget.services.raports.IncomesRaport;
import homebudget.services.raports.SavingsRaport;
import homebudget.userinterface.BootStrap;
import homebudget.userinterface.DataFromUser;

public class Main {


    public static void main(String[] args) {

        Expenses expenses = new Expenses();
        Incomes incomes = new Incomes();

        //Generowanie danych automatycznych
        BootStrap.generateData(expenses, incomes);

        //Pobranie danych od uzytkownika
        DataFromUser.expense(expenses);
        DataFromUser.income(incomes);



        //Generowanie raportow
        ExpensesRaport.perMonthAndCategory(expenses);

        ExpensesRaport.perMonthAndHouseholder(expenses);

        IncomesRaport.perMonth(incomes);

        SavingsRaport.genarate(incomes,expenses);



    }
}
