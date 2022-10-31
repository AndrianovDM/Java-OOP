package Homework6.Data;

public class Coffee {
    protected Integer volumeWater = 0;
    protected Integer coffeeGranul = 0;
    protected boolean sugar = false;

    public Coffee(){
    }

    public Coffee(Integer volumeWater, Integer coffeeGranul) {   
        this.volumeWater = volumeWater;
        this.coffeeGranul = coffeeGranul;
    }

    public Coffee(Integer volumeWater, Integer coffeeGranul, boolean sugar) {
        this.volumeWater = volumeWater;
        this.coffeeGranul = coffeeGranul;
        this.sugar = sugar;
    }

    public Integer getVolumeWater() {
        return volumeWater;
    }

    public Integer getCoffeeGranul() {
        return coffeeGranul;
    }

    @Override
    public String toString() {
        if (sugar)
            return String.format("\nКофе с сахаром: Объем %d мл. (кофе: %d г.)\nСпасибо за покупку!",
                    this.volumeWater, this.coffeeGranul);
        else
            return String.format("\nКофе: Объем %d мл (кофе: %d г. )\nСпасибо за покупку!",
                this.volumeWater, this.coffeeGranul);
    }
}