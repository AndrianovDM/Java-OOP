package Seminar1.Ex1;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product> products = new ArrayList<>();
    public VendingMachine() {
        products.add(new Product("Snikers", 10.00));
        products.add(new Product("Bounty", 15.0));
        products.add(new Product("Mars", 20.3));
        
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if(product.getName().equals(name)) { 
                return product;
            }
    }
    return null;
}

    public Product getProductByCost(Double cost) {
        for (Product product : products) {
            if(product.getCost().equals(cost)) { 
                return product;
            }
    }
    return null;
}

    public Product getProductByCost(String costString) {
        for (Product product : products) {
            if(product.getCost().equals(Double.valueOf(costString))) { 
                return product;
        }
    }
    return null;
}

    public BootleOfTea getBootleOfTea(String name, Double cost, Double volue) {
        return new BootleOfTea(name, cost, volue);
    }

}
