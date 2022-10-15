package Seminar1.Ex1;

public class Service {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        System.out.println(machine.getProductByName("Snikers"));
        System.out.println(machine.getBootleOfTea("pepsi", 20.4, 0.5));
    }
}
