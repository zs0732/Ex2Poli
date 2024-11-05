package com.example.ex2poli;

public class Light extends Vehicles{
    Boolean engine;
    public Light(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, Boolean engine) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants);
        this.engine = engine;
    }
    public boolean isHasEngine() {
        return engine;
    }
    public void setHasEngine(boolean hasEngine) {
        this.engine = hasEngine;
    }

}



