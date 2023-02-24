package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        GenericDuck donaldDuck = new Duck();
        GenericDuck electricDuck = new ElectronicDuck();
        turnOn(donaldDuck, electricDuck);
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void turnOn(GenericDuck... ducks)
    {
        for (GenericDuck duck : ducks) {
            duck.turnOn();
        }
    }

    private void quack(GenericDuck... ducks)
    {
        for (GenericDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(GenericDuck... ducks)
    {
        for (GenericDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
