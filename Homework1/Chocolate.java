package Homework1;

public class Chocolate extends Product{
    private String typeOfChocolate;

    public Chocolate(String name, Double cost, String typeOfChocolate) {
        super(name, cost);
        this.typeOfChocolate = typeOfChocolate;
    }

    @Override
    public void discount() {
        System.out.println("На шоколад есть скидка!");
    }
    @Override
    public void shelfPosition() {
        System.out.println("Весь шоколад находятся на позиции: 4");
    }

    @Override
    public String toString(){
        return "Продукт:" + getName()+ "; " + "Цена:"+ getCost() + "; " + "Тип шоколада:" + typeOfChocolate;
    }

    @Override
    public Double getValume() {
        return null;
    }

    @Override
    public String getWaterType() {
        return "null";
    }

    @Override
    public Integer getExpirationDate() {
        return null;
    }

    @Override
    public String getTypeOfChocolate() {
        return typeOfChocolate;
    }
}


