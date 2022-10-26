package Seminar5;

public class CoffeeBuilder {

    Object coffee;
    Object sugar;
    Object water;
    
    public Object getCoffee() {
        return coffee;
    }
    public Object getSugar() {
        return sugar;
    }
    public Object getWater() {
        return water;
    }
    public void setCoffee(Object coffee) {
        this.coffee = coffee;
    }
    public void setSugar(Object sugar) {
        this.sugar = sugar;
    }
    public void setWater(Object water) {
        this.water = water;
    }

    public Coffee buildCoffee(){
        return null;
    };
}
