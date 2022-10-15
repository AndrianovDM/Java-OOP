package Homework1;

public class BootleOfWater extends Product{
    private Double valume;
    private String waterType;
    
    public BootleOfWater(String name, Double cost, Double valume, String waterType) {
        super(name, cost);
        this.valume = valume;
        this.waterType = waterType;
    }

    @Override
    public Double getValume() {
        return valume;
    }

    @Override
    public String getWaterType() {
        return waterType;
    }

    @Override
    public void discount() {
        System.out.println("На воду скидок нет!");
    }
    @Override
    public void shelfPosition() {
        System.out.println("Вся вода находится на позиции: 1");
    }

    @Override
    public String toString(){
        return "Продукт:" + getName()+ "; " + "Цена:"+ getCost() + "; " + "Объем:" + valume +"; " + "Тип воды:" + waterType;
    }

    @Override
    public Integer getExpirationDate() {
        return null;
    }

    @Override
    public String getTypeOfChocolate() {
        return "None";
    }
}
