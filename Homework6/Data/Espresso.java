package Homework6.Data;

public class Espresso extends Coffee{

    public Espresso(Integer volumeWater, Integer coffeeGranul) {
        super(volumeWater, coffeeGranul);
    }

    public Espresso(Integer volumeWater, Integer coffeeGranul, boolean sugar) {
        super(volumeWater, coffeeGranul, sugar);
    }

    @Override
    public String toString() {
        if (this.sugar)
            return String.format("Эспрессо с сахаром: Объем %d мл (кофе: %d г.)",
                    this.volumeWater, this.coffeeGranul);
        else
            return String.format("Эспрессо: Объем %d мл (кофе: %d g. )",
                    this.volumeWater, this.coffeeGranul);
    }

}