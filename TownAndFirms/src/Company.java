import java.util.List;
import java.util.Objects;

public class Company  {

    private int foundedYear;
    private int foundedMonth;
    private String name;
    private int noOfEmployee;
    private double revenue;
    //private City city;


    public Company(int foundedYear, int foundedMonth, String name, int noOfEmployee, double revenue) {
        this.foundedYear = foundedYear;
        this.name = name;
        this.noOfEmployee = noOfEmployee;
        this.revenue = revenue;
        this.foundedMonth = foundedMonth;
    }

    public int getFoundedMonth() {
        return foundedMonth;
    }

    public void setFoundedMonth(int foundedMonth) {
        this.foundedMonth = foundedMonth;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public void setNoOfEmployee(int noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return foundedYear == company.foundedYear &&
                foundedMonth == company.foundedMonth &&
                noOfEmployee == company.noOfEmployee &&
                Double.compare(company.revenue, revenue) == 0 &&
                Objects.equals(name, company.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foundedYear, foundedMonth, name, noOfEmployee, revenue);
    }


}
