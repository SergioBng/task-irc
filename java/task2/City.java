package task2;

public class City {
    boolean isTheCapital;
    boolean isRegionalCenter;
    double area;

    public City(boolean isTheCapital, boolean isRegionalCenter, double area) {
        this.isTheCapital = isTheCapital;
        this.isRegionalCenter = isRegionalCenter;
        this.area = area;
    }

    @Override
    public String toString() {
        return "City{" +
                "isTheCapital=" + isTheCapital +
                ", isRegionalCenter=" + isRegionalCenter +
                ", area=" + area +
                '}';
    }
}
