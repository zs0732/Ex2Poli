package com.example.ex2poli;

public class RefrigeratedTruck extends Truck {
    int coolingCapacity;

    public RefrigeratedTruck(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int trailers, double loading, int coolingCapacity) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars,pollutants, trailers, loading);
        this.coolingCapacity = coolingCapacity;

    }


        public int getCoolingCapacity () {
        return coolingCapacity;
    }
        public void setCoolingCapacity ( int coolingCapacity){
        this.coolingCapacity = coolingCapacity;
    }
    }
