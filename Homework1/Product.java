package Homework1;

public abstract class Product {
    private String name;
    private Double cost;
    
    public Product(String name, Double cost) { 
        this.name = name;
        this.cost = cost;
    }

    public abstract void discount();

    public abstract void shelfPosition();

    public abstract Double getValume();

    public abstract String getWaterType();

    public abstract String toString();

    public abstract Integer getExpirationDate();
    
    public abstract String getTypeOfChocolate();
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    
}



