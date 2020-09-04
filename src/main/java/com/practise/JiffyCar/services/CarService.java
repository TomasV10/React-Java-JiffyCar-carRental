package com.practise.JiffyCar.services;

import com.practise.JiffyCar.entities.Car;
import com.practise.JiffyCar.exception.ResourceNotFoundException;
import com.practise.JiffyCar.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity <Car> getCarById(Integer id) {
        Car car = carsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car does not exist with id :" + id));
        return ResponseEntity.ok(car);
    }

    public Car updateCarById (Integer id, Car car) {
        Car existingCar = carsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car does not exist with id : " + id));
        existingCar.setCarMaker(car.getCarMaker());
        existingCar.setCarModel(car.getCarModel());
        existingCar.setManuYear(car.getManuYear());
        existingCar.setNumOfSeats(car.getNumOfSeats());
        existingCar.setPricePerDay(car.getPricePerDay());
        existingCar.setRentedFrom(car.getRentedFrom());
        existingCar.setRentedTo(car.getRentedTo());

        return carsRepository.save(existingCar);
    }

    public void deleteById(Integer id) {
        carsRepository.deleteById(id);
    }

}
