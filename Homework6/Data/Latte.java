package Homework6.Data;

public class Latte extends Coffee {

    private String milk = "";
    private boolean sugar = false;

    public Latte(Coffee coffee) {
        this.volumeWater = coffee.getVolumeWater();
        this.coffeeGranul = coffee.getCoffeeGranul();
    }

    public Latte(Coffee coffee, boolean sugar) {
        this.volumeWater = coffee.getVolumeWater();
        this.coffeeGranul = coffee.getCoffeeGranul();
        this.sugar = sugar;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nЛатте: 200 мл. Включая:\n");
        sb.append(String.format("Эспрессо: Объем %d мл (кофе: %d г.)",
                this.volumeWater, this.coffeeGranul)).append("\n");

        if (sugar) sb.append("Сахар.").append("\n");

        sb.append(milk).append("\n");
        return sb.toString();
    }

}