package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarServiceImpl implements CarService {
    private List<Car> carsList;

    public CarServiceImpl() {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("BMW", 364, "black"));
        carsList.add(new Car("Audi", 8248, "blue"));
        carsList.add(new Car("Tesla", 111, "silver"));
        carsList.add(new Car("Honda", 500, "red"));
        carsList.add(new Car("Ford", 1779, "white"));

        this.carsList = carsList;
    }
    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            return carsList;
        } else {
            List<Car> list = carsList.stream().limit(count).collect(Collectors.toList());
            return list;
        }
    }
}
