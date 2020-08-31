package com.practise.JiffyCar.controllers;

import com.practise.JiffyCar.entities.Car;
import com.practise.JiffyCar.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin("*")
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getCarList(){
        return carService.getCarsList();
    }
}
