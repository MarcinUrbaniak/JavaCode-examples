package homebudget.model.expense;

import homebudget.model.categories.ExpenseCategory;
import homebudget.model.householders.Householder;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Expense {

   private Date expenseDateTime;
   private ExpenseCategory expenseCategory;
   private Householder householder;
   private double ammount;
   //private String name;


    public Expense(LocalDateTime expenseDateTime, ExpenseCategory expenseCategory, Householder householder, double ammount) {
        this.expenseDateTime = expenseDateTime;
        this.expenseCategory = expenseCategory;
        this.householder = householder;
        this.ammount = ammount;
        //this.name = name;
    }


    public Date getExpenseDateTime() {
        return expenseDateTime;
    }

    public void setExpenseDateTime(Date expenseDateTime) {
        this.expenseDateTime = expenseDateTime;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public Householder getHouseholder() {
        return householder;
    }

    public void setHouseholder(Householder householder) {
        this.householder = householder;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return Double.compare(expense.ammount, ammount) == 0 &&
                Objects.equals(expenseDateTime, expense.expenseDateTime) &&
                expenseCategory == expense.expenseCategory &&
                householder == expense.householder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(expenseDateTime, expenseCategory, householder, ammount);
    }
}
