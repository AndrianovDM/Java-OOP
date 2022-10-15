package Homework1;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> water = new ArrayList<>();
    ArrayList<Product> bap = new ArrayList<>();
    ArrayList<Product> chocolate = new ArrayList<>();

    public VendingMachine() {
        water.add(new BootleOfWater("Borjomi", 8.0, 1.0, "без газа"));
        water.add(new BootleOfWater("BonAqua", 5.0, 0.5, "c газом"));
        water.add(new BootleOfWater("BonAqua", 5.0, 0.5, "без газа"));
        bap.add(new Bap("Roll", 10.5, 5));
        bap.add(new Bap("Cinnabon", 15.2, 2));
        chocolate.add(new Chocolate("Alenka", 3.0, "молочный"));
        chocolate.add(new Chocolate("October", 5.2, "горький"));
        chocolate.add(new Chocolate("October", 4.2, "молочный"));
    }

    public Product getProductByName(String name) {
        for (Product productOne: water) {
            if(productOne.getName().equals(name)) { 
                productOne.discount();
                productOne.shelfPosition();
                return productOne;
            }
        for (Product productTwo: bap) {
            if(productTwo.getName().equals(name)) { 
                productTwo.discount();
                productTwo.shelfPosition();
                return productTwo;
                }
            }
        for (Product productThree: chocolate) {
            if(productThree.getName().equals(name)) {
                productThree.discount();
                productThree.shelfPosition();
                return productThree;
                }
            }
        }
        return null;
    }

    public Product getProductByCost(Double cost) {
        for (Product productOne: water) {
            if(productOne.getCost().equals(cost)) { 
                productOne.discount();
                productOne.shelfPosition();
                return productOne;
            }
        }
        for (Product productTwo: bap) {
            if(productTwo.getCost().equals(cost)) {
                productTwo.discount();
                productTwo.shelfPosition(); 
                return productTwo;
            }
        }
        for (Product productThree: chocolate) {
            if(productThree.getCost().equals(cost)) {
                productThree.discount();
                productThree.shelfPosition();  
                return productThree;
            }
        }
        return null;
    }

    public Product getProductByValume(Double valume) {
        for (Product product: water) {
            if(product.getValume().equals(valume)) {
                product.discount();
                product.shelfPosition();
                return product;
            }
        }
        return null;
    }

    public Product getProductByWaterType(String waterType) {
        for (Product product: water) {
            if(product.getWaterType().equals(waterType)) {
                product.discount();
                product.shelfPosition(); 
                return product;
            }
        }
        return null;
    }

    public Product getProductByExpirationDate(Integer expirationDate) {
        for (Product product: bap) {
            if(product.getExpirationDate().equals(expirationDate)) {
                product.discount();
                product.shelfPosition(); 
                return product;
            }
        }
        return null;
    }
    public Product getProductByTypeOfChocolate(String typeOfChocolate) {
        for (Product product: chocolate) {
            if(product.getTypeOfChocolate().equals(typeOfChocolate)) {
                product.discount();
                product.shelfPosition(); 
                return product;
            }
        }
        return null;
    }
}
