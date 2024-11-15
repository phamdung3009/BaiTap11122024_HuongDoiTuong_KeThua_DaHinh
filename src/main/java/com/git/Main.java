package com.git;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Vehicle> vehicles = new ArrayList<>();

    private void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    private int totalVehicle() {
        int total = 0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calculateParkingFee();
        }
        return total;
    }

    private List<Vehicle> getVehicles() {
        return vehicles;
    }

    public static void main(String[] args) {
        Vehicle car = new Car(1, "oto", "4 cho", 12345, 2);
        Vehicle motor = new Motorcycle(2, "xe may", "2 cho", 23451, 3);
        Vehicle truck = new Truck(3, "xe tai", "3 cho", 54321, 4);


        Main main = new Main();
        main.add(car);
        main.add(motor);
        main.add(truck);
        for (Vehicle vehicle : main.getVehicles()) {
            System.out.println(vehicle);
        }
        int total = main.totalVehicle();
        System.out.println(total);
    }
}