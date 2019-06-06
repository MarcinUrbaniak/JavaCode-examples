package homebudget.services.modify;

import homebudget.model.data.repository.Incomes;
import homebudget.model.income.Income;

public class IncomesModify {


    public static void add(Incomes incomes, Income income){

        incomes.getIncomes().add(income);
    }



    public static boolean remove(Incomes incomes, Income income){
        if (incomes.getIncomes().contains(income)){
            incomes.getIncomes().remove(income);
            return true;
        }
        return false;
    }
}
