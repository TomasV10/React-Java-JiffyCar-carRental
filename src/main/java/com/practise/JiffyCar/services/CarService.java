package com.practise.JiffyCar.services;

import com.practise.JiffyCar.entities.Car;
import com.practise.JiffyCar.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarsRepository carsRepository;

    public List<Car>getCarsList() {
        return carsRepository.findAll();
    }

}
