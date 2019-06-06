package homebudget.model.income;

import homebudget.model.categories.IncomeCategory;
import homebudget.model.householders.Householder;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Income {

    private LocalDateTime incomeDateTime;
    private IncomeCategory incomeCategory;
    private Householder householder;
    private double ammount;

    public Income(LocalDateTime incomeDateTime, IncomeCategory incomeCategory, Householder householder, double ammount) {
        this.incomeDateTime = incomeDateTime;
        this.incomeCategory = incomeCategory;
        this.householder = householder;
        this.ammount = ammount;
    }


    public LocalDateTime getIncomeDateTime() {
        return incomeDateTime;
    }

    public void setIncomeDateTime(LocalDateTime incomeDateTime) {
        this.incomeDateTime = incomeDateTime;
    }

    public IncomeCategory getIncomeCategory() {
        return incomeCategory;
    }

    public void setIncomeCategory(IncomeCategory incomeCategory) {
        this.incomeCategory = incomeCategory;
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
        Income income = (Income) o;
        return Double.compare(income.ammount, ammount) == 0 &&
                Objects.equals(incomeDateTime, income.incomeDateTime) &&
                incomeCategory == income.incomeCategory &&
                householder == income.householder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(incomeDateTime, incomeCategory, householder, ammount);
    }

    @Override
    public String toString() {
        return "Income{" +
                "incomeDateTime=" + incomeDateTime +
                ", incomeCategory=" + incomeCategory +
                ", householder=" + householder +
                ", ammount=" + ammount +
                '}';
    }
}
