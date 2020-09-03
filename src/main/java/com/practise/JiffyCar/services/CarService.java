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

    public Car save(Car car) {
       return carsRepository.save(car);
    }

    public Car get(Integer id) {
        return carsRepository.findById(id).get();
    }

    public void delete(Integer id) {
        carsRepository.deleteById(id);
    }

}
