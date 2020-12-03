package task2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class DemoOfCountry {
    public static void main(String[] args) {
        City cityMinsk = new City(true, true, 1533.32);
        City cityGomel = new City(false, true, 1223.12);
        City cityGrodno = new City(false, true, 500.21);
        City cityZaslavl = new City(false, false, 144.54);
        City cityBorisov = new City(false, false, 123.65);

        List<City> listOfCityInMinskiyDistrict = new ArrayList<>();
        listOfCityInMinskiyDistrict.add(cityMinsk);
        listOfCityInMinskiyDistrict.add(cityZaslavl);

        List<City> listOfCityInGrodnenskiyDistrict = new ArrayList<>();
        listOfCityInGrodnenskiyDistrict.add(cityGrodno);

        List<City> listOfCityInGomelskiyDistrict = new ArrayList<>();
        listOfCityInGomelskiyDistrict.add(cityGomel);

        List<City> listOfCityInBorisovskiyDistrict = new ArrayList<>();
        listOfCityInBorisovskiyDistrict.add(cityBorisov);

        District districtMinskiy = new District(123821.12, listOfCityInMinskiyDistrict);
        District districtGrodnenskiy = new District(124242.02, listOfCityInGrodnenskiyDistrict);
        District districtGomelskiy = new District(234244.23, listOfCityInGomelskiyDistrict);
        District districtBorisovskiy = new District(124314.32, listOfCityInBorisovskiyDistrict);

        List<District> listOfDistrictInGomelskiyRegion = new ArrayList<>();
        listOfDistrictInGomelskiyRegion.add(districtGomelskiy);

        List<District> listOfDistrictInMinskiyRegion = new ArrayList<>();
        listOfDistrictInMinskiyRegion.add(districtMinskiy);
        listOfDistrictInMinskiyRegion.add(districtBorisovskiy);

        List<District> listOfDistrictInGrodnenskiyRegion = new ArrayList<>();
        listOfDistrictInGrodnenskiyRegion.add(districtGrodnenskiy);

        Region regionMinskiy = new Region(13424144.23, listOfDistrictInMinskiyRegion);
        Region regionGomelskiy = new Region(14341134.23, listOfDistrictInGomelskiyRegion);
        Region regionGrodnenskiy = new Region(2434243.12, listOfDistrictInGrodnenskiyRegion);

        List<Region> listOfRegionInState = new ArrayList<>();
        listOfRegionInState.add(regionGomelskiy);
        listOfRegionInState.add(regionGrodnenskiy);
        listOfRegionInState.add(regionMinskiy);
    }
}
