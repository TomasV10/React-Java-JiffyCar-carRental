package com.practise.JiffyCar.repositories;


import com.practise.JiffyCar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Car, Integer> {
}
