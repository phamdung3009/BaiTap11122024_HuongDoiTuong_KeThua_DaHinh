package com.git;

public class Motorcycle extends Vehicle {
    private int hasSidecar;

    public Motorcycle() {
    }

    public Motorcycle(int id, String brand, String model, int licensePlate, int hasSidecar) {
        super(id, brand, model, licensePlate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public int calculateParkingFee() {
        return hasSidecar * 3;
    }
}
