package com.practise.JiffyCar.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "carlist")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "car_maker")
    private String carMaker;
    @Column(name = "car_model")
    private  String carModel;
    @Column(name = "manufacturing_year")
    private String manuYear;
    @Column(name = "number_of_seats")
    private int numOfSeats;
    @Column(name = "price_per_day")
    private double pricePerDay;
    @Column(name = "rented_day_from")
    private Date rentedFrom;
    @Column(name = "rented_day_to")
    private Date rentedTo;

    public Car() {
    }

    public Car(int id, String carMaker, String carModel, String manuYear, int numOfSeats, double pricePerDay, Date rentedFrom, Date rentedTo) {
        this.id = id;
        this.carMaker = carMaker;
        this.carModel = carModel;
        this.manuYear = manuYear;
        this.numOfSeats = numOfSeats;
        this.pricePerDay = pricePerDay;
        this.rentedFrom = rentedFrom;
        this.rentedTo = rentedTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getManuYear() {
        return manuYear;
    }

    public void setManuYear(String manuYear) {
        this.manuYear = manuYear;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Date getRentedFrom() {
        return rentedFrom;
    }

    public void setRentedFrom(Date rentedFrom) {
        this.rentedFrom = rentedFrom;
    }

    public Date getRentedTo() {
        return rentedTo;
    }

    public void setRentedTo(Date rentedTo) {
        this.rentedTo = rentedTo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carMaker='" + carMaker + '\'' +
                ", carModel='" + carModel + '\'' +
                ", manuYear='" + manuYear + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", pricePerDay=" + pricePerDay +
                ", rentedFrom=" + rentedFrom +
                ", rentedTo=" + rentedTo +
                '}';
    }

//    public CarDto toDto() {
//        return new CarDto(id, carMaker, carModel, manuYear, numOfSeats, pricePerDay, rentedFrom, rentedTo);
//    }
}
