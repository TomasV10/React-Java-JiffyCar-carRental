package com.practise.JiffyCar.dtos;

import javax.persistence.Column;
import java.util.Date;

public class CarDto {
    private int id;
    private String carMaker;
    private  String carModel;
    private String manuYear;
    private int numOfSeats;
    private double pricePerDay;
    private Date rentedFrom;
    private Date rentedTo;

    public CarDto() {
    }

    public CarDto(int id, String carMaker, String carModel, String manuYear, int numOfSeats, double pricePerDay, Date rentedFrom, Date rentedTo) {
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
        return "CarDto{" +
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
}
