package com.example.ex2poli;

public class Cart extends Light{
    double loadingTime;

    public Cart(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, Boolean engine, double loadingTime) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, engine);
        this.loadingTime = loadingTime;
    }

        public double getLoadingTime() {
        return loadingTime;
    }
        public void setLoadingTime(int loadingTime) {
        this.loadingTime = loadingTime;
    }

        @Override
        public int exhaust() {
            return (int) (getPollutants() * 30);
        }

        public void hitchhikers() {
            System.out.println("Cart hitchhikers logic");
        }


    }


