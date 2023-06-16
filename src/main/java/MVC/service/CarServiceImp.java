package MVC.service;

import MVC.model.Car;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;
@Component
public class CarServiceImp implements CarService {

    List<Car> carList = Arrays.asList(
            new Car("Toyota", 32323, "Fingolfin"),
            new Car("Honda", 21213, "Turin"),
            new Car("Ford", 5542, "Gandalf"),
            new Car("Chevrolet", 1123, "Nienor"),
            new Car("Tesla", 123, "John")
    );

    @Override
    public List<Car> getCarList(int count) {
        if (count > 5) {
            count = 5;
        } else if (count > carList.size()) {
            throw new IllegalArgumentException("NonData");
        }
        return carList.subList(0, count);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
