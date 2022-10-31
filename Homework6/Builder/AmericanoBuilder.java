package Homework6.Builder;

import Homework6.Data.Americano;

public class AmericanoBuilder extends CoffeeBuilder {

    void addWater(Americano americano) {
        System.out.println("Нагреваем воду...");
        americano.setVolumeWater(180);
        System.out.println("Вода нагрелась!.");
    }

    public Americano buildLatte() {
        Americano americano = new Americano(buildCoffee());
        addWater(americano);
        return americano;
    }

    public Americano buildSweetAmericano() {
        Americano cupOfAmericano = new Americano(buildCoffee(), true);
        addWater(cupOfAmericano);
        return cupOfAmericano;
    }


}