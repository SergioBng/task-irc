package task2;

import java.util.List;
import java.util.Objects;

public class District {
    private double area;
    private List<City> listOfCities;

    public District(double area, List<City> listOfCities) {
        this.area = area;
        this.listOfCities = listOfCities;
    }

    public List<City> getListOfCities() {
        return listOfCities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.area, area) == 0 && Objects.equals(listOfCities, district.listOfCities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, listOfCities);
    }

    @Override
    public String toString() {
        return "District{" +
                "area=" + area +
                '}';
    }
}
