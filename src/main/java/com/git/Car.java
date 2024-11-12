package com.git;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int id, String brand, String model, int licensePlate, int numberOfSeats) {
        super(id, brand, model, licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int calculateParkingFee() {
        return numberOfSeats * 2;
    }
}
