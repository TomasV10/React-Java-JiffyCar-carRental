package com.practise.JiffyCar.controllers;

import com.practise.JiffyCar.entities.Car;
import com.practise.JiffyCar.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getCarList(){
        return carService.getCarsList();
    }
    @GetMapping("/cars/{id}")
    public Car get(@PathVariable Integer id) {
        return carService.get(id);
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping("/cars/{id}")
    public void update(@RequestBody  Car car,
                       @PathVariable Integer id) {
        Car existingCar = carService.get(id);
        carService.save(car);
    }

    @DeleteMapping("/cars/{id}")
    public void delete (@PathVariable Integer id) {
       carService.delete(id);
    }
}
