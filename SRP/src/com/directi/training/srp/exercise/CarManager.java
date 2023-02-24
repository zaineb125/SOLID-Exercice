package com.directi.training.srp.exercise;

public class CarManager
{
    private CarDB carDB= new CarDB();
    private CarNames carNames = new CarNames(carDB);
    private BestCar bestCar = new BestCar(carDB);

    public Car getCar(final String carId)
    {
        return this.carDB.getCarById(carId);
    }

    public String getCarsNames()
    {
        return carNames.getAllCarsNames();
    }

    public Car getBestCar()
    {
        return bestCar.getBestCar();
    }
}
