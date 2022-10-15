package Homework1;

public class Bap extends Product{
    private Integer expirationDate;

    public Bap(String name, Double cost, Integer expirationDate) {
        super(name, cost);
        this.expirationDate = expirationDate;
    }

    @Override
    public void discount() {
        System.out.println("На булочки есть скидка!");
    }
    
    @Override
    public void shelfPosition() {
        System.out.println("Все булочки находятся на позиции: 3");
    }

    @Override
    public Double getValume() {
        return null;
    }

    @Override
    public String getWaterType() {
        return "None";
    }

    @Override
    public String toString(){
        return "Продукт:" + getName()+ "; " + "Цена:"+ getCost() + "; " + "Срок годности:" + expirationDate;
    }

    @Override
    public Integer getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getTypeOfChocolate() {
        return "None";
    }
}