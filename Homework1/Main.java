package Homework1;
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        System.out.println(machine.getProductByName("Borjomi"));
        System.out.println();
        System.out.println(machine.getProductByName("Roll"));
        System.out.println();
        System.out.println(machine.getProductByName("October"));
        System.out.println();
        System.out.println(machine.getProductByCost(5.0));
        System.out.println();
        System.out.println(machine.getProductByValume(1.0));
        System.out.println();
        System.out.println(machine.getProductByExpirationDate(2));
        System.out.println();
        System.out.println(machine.getProductByTypeOfChocolate("горький"));
        }
    }
