package com.example.ex2poli;

public class Tractor extends Heavy{
    String trailresTypes;
    public Tractor(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int trailers, String trailresTypes) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, trailers);
        this.trailresTypes = trailresTypes;
    }

    public String getTrailerTypes() { return trailresTypes; }
    public void setTrailerTypes(String trailerTypes) { this.trailresTypes = trailerTypes; }


}

