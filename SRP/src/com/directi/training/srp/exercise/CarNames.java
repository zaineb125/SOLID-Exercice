package com.directi.training.srp.exercise;

import java.util.List;

public class CarNames {
    private CarDB carDB ;
    public CarNames(CarDB carDB) {
        this.carDB = carDB ;
    }
    public String getAllCarsNames() {
        List<Car> _carsDb = this.carDB.getCars();
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
