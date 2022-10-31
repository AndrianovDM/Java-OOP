package Homework6.Builder;

import Homework6.Data.Latte;;

public class LatteBuilder extends CoffeeBuilder {

    void addMilk(Latte latte){
        System.out.println("Греем молоко...");
        latte.setMilk("МОлоко, 140 мл. ");
        System.out.println("Молоко готово!");
    }

    public Latte buildLatte(){
        Latte latte = new Latte(buildCoffee());
        addMilk(latte);
        return latte;
    }

    public Latte buildSweetLatte(){
        Latte latte = new Latte(buildCoffee(), true);
        addMilk(latte);
        return latte;
    }

}