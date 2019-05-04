import java.util.List;
import java.util.Objects;

public class City {

    private String nameOfTown;
    private List<Company> company;

    public City(String nameOfTown) {
        this.nameOfTown = nameOfTown;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }

    public String getNameOfTown() {
        return nameOfTown;
    }

    public void setNameOfTown(String nameOfTown) {
        this.nameOfTown = nameOfTown;
    }


    public List<Company> getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(nameOfTown, city.nameOfTown) &&
                Objects.equals(company, city.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTown, company);
    }
}
