package homebudget.model.data.repository;

import homebudget.model.expense.Expense;

import java.util.List;
import java.util.Objects;

public class Expenses {

    private List<Expense> expenses;

    public Expenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "expenses=" + expenses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expenses expenses1 = (Expenses) o;
        return Objects.equals(expenses, expenses1.expenses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expenses);
    }
}
