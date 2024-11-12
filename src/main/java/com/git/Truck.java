package com.git;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck() {
    }

    public Truck(int id, String brand, String model, int licensePlate, int loadCapacity) {
        super(id, brand, model, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int calculateParkingFee() {
        return loadCapacity * 4;
    }
}
