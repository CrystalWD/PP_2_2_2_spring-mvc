package MVC.service;

import MVC.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList(int count);
    List<Car> getAllCars();
}
