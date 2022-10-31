package Homework6.Builder;

import Homework6.Data.Coffee;

public class CoffeeBuilder {

    public CoffeeBuilder() {
    }

    void boilWater() {
        System.out.println("Кипятим воду...");
        System.out.println("Готово!");
    }

    public Coffee buildCoffee() {
        boilWater();
        return new Coffee(30, 10);
    }

    public Coffee buildSweetCoffee() {
        boilWater();
        return new Coffee(30, 10, true);
    }
}