package homebudget.controller;

import homebudget.model.data.repository.Incomes;
import homebudget.userinterface.DataFromUser;

public class ControlIncome {

    public static void tryAgain(Incomes incomes){

        DataFromUser.income(incomes);
    }
}
