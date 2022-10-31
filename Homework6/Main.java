package Homework6;

import Homework6.Builder.AmericanoBuilder;
import Homework6.Builder.EspressoBuilder;
import Homework6.Builder.LatteBuilder;
import Homework6.Builder.CoffeeBuilder;

import Homework6.Data.Espresso;
import Homework6.Data.Americano;
import Homework6.Data.Coffee;
import Homework6.Data.Latte;


public class Main {
    public static void main(String[] args) {
        CoffeeBuilder cofBuilder = new CoffeeBuilder();
        EspressoBuilder espBuilder = new EspressoBuilder();
        LatteBuilder latBuilder = new LatteBuilder();
        AmericanoBuilder americBuilder = new AmericanoBuilder();
        String separator = "\n" + "--".repeat(50);

        System.out.println(separator);
        Coffee coffe = cofBuilder.buildCoffee();
        System.out.println(coffe);
        System.out.println(separator);

        System.out.println();
        System.out.println(separator);
        Espresso espresso = espBuilder.buildSweetCoffee();
        System.out.println(espresso);
        System.out.println(separator);

        System.out.println();
        System.out.println(separator);
        Latte latte = latBuilder.buildSweetLatte();
        System.out.println(latte);
        System.out.println(separator);

        System.out.println();
        System.out.println(separator);
        Americano americano = americBuilder.buildSweetAmericano();
        System.out.println(americano);
        System.out.println(separator);

    }
}
