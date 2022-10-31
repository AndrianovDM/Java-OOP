package Homework6.Builder;

import Homework6.Data.Espresso;

public class EspressoBuilder {

    public EspressoBuilder() {
    }

    void boilWater() {
        System.out.println("Кипятим воду...");
        System.out.println("Готово!");
    }

    public Espresso buildCoffee() {
        boilWater();
        return new Espresso(60, 20);
    }

    public Espresso buildSweetCoffee() {
        boilWater();
        return new Espresso(60, 20, true);
    }
}