package task2;

import java.util.List;

public class State {
    double area;
    List<Region> listOfRegions;

    public State(double area, List<Region> listOfRegions) {
        this.area = area;
        this.listOfRegions = listOfRegions;
    }
}
