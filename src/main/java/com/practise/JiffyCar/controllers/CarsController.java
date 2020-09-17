package com.practise.JiffyCar.controllers;

import com.practise.JiffyCar.entities.Car;
import com.practise.JiffyCar.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity <Car> getCarById(@PathVariable Integer id) {
        return carService.getCarById(id);
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.save(car);
    }
    @PutMapping("/cars/{id}")
    public ResponseEntity <Car> updateCar(@RequestBody  Car car,
                       @PathVariable Integer id) {
        Car updatedCar = carService.updateCarById(id, car);
        return ResponseEntity.ok(updatedCar);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteById (@PathVariable Integer id) {
       carService.deleteById(id);
    }
}
