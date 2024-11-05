package com.example.ex2poli;

public class ElectricCar extends Regular {
    int batteryCapacity;

    public ElectricCar(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int traveling, int batteryCapacity) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, traveling);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }



}
