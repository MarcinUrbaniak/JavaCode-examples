package homebudget.model.data.repository;

import homebudget.model.income.Income;

import java.util.List;
import java.util.Objects;

public class Incomes {

    private List<Income> incomes;

    public Incomes() {
    }

    public Incomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    @Override
    public String toString() {
        return "Incomes{" +
                "incomes=" + incomes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incomes incomes1 = (Incomes) o;
        return Objects.equals(incomes, incomes1.incomes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incomes);
    }
}
