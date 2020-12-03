package task2;

import java.util.Objects;

public class City {
    private String name;
    private boolean isTheCapital;
    private boolean isRegionalCenter;
    private double area;

    public City(String name, boolean isTheCapital, boolean isRegionalCenter, double area) {
        this.name = name;
        this.isTheCapital = isTheCapital;
        this.isRegionalCenter = isRegionalCenter;
        this.area = area;
    }

    public City() {

    }

    public String getName() {
        return name;
    }

    public boolean isTheCapital() {
        return isTheCapital;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isTheCapital == city.isTheCapital && isRegionalCenter == city.isRegionalCenter && Double.compare(city.area, area) == 0 && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isTheCapital, isRegionalCenter, area);
    }

    @Override
    public String toString() {
        return "City: {" +
                "name='" + name + '\'' +
                ", isTheCapital=" + isTheCapital +
                ", isRegionalCenter=" + isRegionalCenter +
                ", area=" + area +
                '}';
    }
}
