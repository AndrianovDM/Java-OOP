package Homework6.Data;

public class Americano extends Coffee{

    private boolean sugar = false;

    public Americano(Coffee coffee) {
        this.volumeWater = coffee.getVolumeWater();
        this.coffeeGranul = coffee.getCoffeeGranul();
    }

    public Americano(Coffee coffee, boolean sugar) {
        this.volumeWater = coffee.getVolumeWater();
        this.coffeeGranul = coffee.getCoffeeGranul();
        this.sugar = sugar;
    }

    public void setVolumeWater(int volumeWater) {
        this.volumeWater += volumeWater;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nАмерикано: 200 мл. Включает:\n");
        sb.append(String.format("Вода: Объем %d мл\nКофе: %d г.",
                this.volumeWater, this.coffeeGranul)).append("\n");

        if (sugar) sb.append("Сахар.").append("\n");

        return sb.toString();
    }

}
