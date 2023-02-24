package com.directi.training.srp.exercise;

import java.util.List;

public class BestCar {
    private CarDB carDB ;
    public BestCar(CarDB carDB) {
        this.carDB = carDB ;
    }
    public Car getBestCar() {
        List<Car> _carsDb = this.carDB.getCars();
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
