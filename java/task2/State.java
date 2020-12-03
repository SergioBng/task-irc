package task2;

import java.util.List;

public class State {
    private double area;
    private List<Region> listOfRegions;

    public State(double area, List<Region> listOfRegions) {
        this.area = area;
        this.listOfRegions = listOfRegions;
    }

    public City findTheCapitalOfState() {
        City capital = new City();
        for (Region region: listOfRegions) {
            for (District district: region.getListOfDistricts()) {
                for (City city: district.getListOfCities()) {
                    if (city.isTheCapital()) {
                        capital = city;
                    }
                }
            }
        }
        System.out.println("The capital of Belarus is " + capital);
        return capital;
    }

    public int findCountOfRegions() {
        int countOfRegion = listOfRegions.size();
        System.out.println("Count of regions is " + countOfRegion);
        return countOfRegion;
    }

    public void findAreaOfCities() {
        System.out.println("\nCities and areas:\n");
        for (Region region: listOfRegions) {
            for (District district: region.getListOfDistricts()) {
                for (City city: district.getListOfCities()) {
                    System.out.printf("%s - %.2f\n", city.getName(), city.getArea());
                }
            }
        }
    }

    public void findRegionalCenter() {
        System.out.println("\nRegional centers:\n");
        for (Region region: listOfRegions) {
            for (District district: region.getListOfDistricts()) {
                for (City city: district.getListOfCities()) {
                    if (city.isRegionalCenter()) {
                        System.out.println(city.getName());
                    }
                }
            }
        }
    }
}
