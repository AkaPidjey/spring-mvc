package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> carsMethod() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("black", "bmw", 100));
        carsList.add(new Car("white", "mersedes", 200));
        carsList.add(new Car("yellow", "vw", 300));
        carsList.add(new Car("green", "lada", 400));
        carsList.add(new Car("orange", "dodge", 500));
        return carsList;
    }
}
