package task2;

import java.util.List;

public class Region {
    double area;
    List<District> listOfDistricts;

    public Region(double area, List<District> listOfDistricts) {
        this.area = area;
        this.listOfDistricts = listOfDistricts;
    }
}
