package task2;

import java.util.List;
import java.util.Objects;

public class Region {
    private double area;
    private List<District> listOfDistricts;

    public Region(double area, List<District> listOfDistricts) {
        this.area = area;
        this.listOfDistricts = listOfDistricts;
    }

    public List<District> getListOfDistricts() {
        return listOfDistricts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.area, area) == 0 && Objects.equals(listOfDistricts, region.listOfDistricts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, listOfDistricts);
    }

    @Override
    public String toString() {
        return "Region{" +
                "area=" + area +
                '}';
    }
}
