package com.example.ex2poli;

public class Truck extends Heavy {
    double loading;

    public Truck(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int trailers, double loading) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, trailers);
        this.loading = loading;
    }

    public double getMaxLoadWeight() {
        return loading;
    }

    public void setMaxLoadWeight(int loading) {
        this.loading = loading;
    }

    @Override
    public int exhaust() {
        return (int) (super.exhaust() * 1.5);
    }


}


