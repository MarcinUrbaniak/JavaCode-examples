package homebudget.controller;

import homebudget.model.data.repository.Expenses;
import homebudget.model.income.Income;
import homebudget.userinterface.DataFromUser;

public class ControlExpense {

    public static void tryAgain(Expenses expenses){
        DataFromUser.expense(expenses);
    }







}
