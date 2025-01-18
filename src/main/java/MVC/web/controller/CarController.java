package MVC.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import MVC.service.CarService;


@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(required = false) Integer count,
                           Model model) {
        if (count == null) {
            model.addAttribute("cars", carService.getAllCars());
            return "car228";
        }
        model.addAttribute("cars", carService.getCarList(count));
        return "car";
    }

}
