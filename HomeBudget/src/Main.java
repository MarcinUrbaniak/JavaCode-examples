import homebudget.model.data.repository.Expenses;
import homebudget.model.data.repository.Incomes;
import homebudget.userinterface.BootStrap;

public class Main {


    public static void main(String[] args) {

        Expenses expenses = new Expenses();
        Incomes incomes = new Incomes();

        BootStrap.generateData(expenses, incomes);


    }
}
