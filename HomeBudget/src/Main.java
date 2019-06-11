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

        BootStrap.generateData(expenses, incomes);


        //DataFromUser.expense(expenses);
        //DataFromUser.income(incomes);




        ExpensesRaport.perMonthAndCategory(expenses);
        System.out.println();
        ExpensesRaport.perMonthAndHouseholder(expenses);
        IncomesRaport.perMonth(incomes);
        SavingsRaport.genarate(incomes,expenses);



    }
}
