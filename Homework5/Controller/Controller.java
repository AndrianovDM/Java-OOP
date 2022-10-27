package Homework5.Controller;
import java.util.logging.Logger;
import java.util.Scanner;

public class Controller {
    ComputerBuilder cb = new ComputerBuilder();
    Database base = new Database();

    public void start(){
        Logger logger = Logger.getAnonymousLogger();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nВыберете:\n" +
        "1 - показать запчасти компьютера\n" +
        "2 - создать сборку компьбтера\n");

        int action = iScanner.nextInt();
        iScanner.nextLine();

        switch (action) {
            case 1:
                logger.info(base.toString());
                break;
            case 2:
                System.out.println("\nВыберете материнскую плату:\n");
                String mb = iScanner.nextLine();
                cb.setMother(base.m, mb);

                System.out.println("\nВыберете процессор:\n");
                String p = iScanner.nextLine();
                cb.setProcessor(base.p, p);

                System.out.println("\nВыберете оперативную память:\n");
                String r = iScanner.nextLine();
                cb.setRam(base.r, r);

                System.out.println("\nВыберете SSD диск:\n");
                String s = iScanner.nextLine();
                cb.setSsd(base.s, s);

                System.out.println("\nВыберете видеокарту:\n");
                String v = iScanner.nextLine();
                cb.setVideoCard(base.v, v);

                logger.info(base.toString());
                break;

            default:
                logger.info("Неверные данные!");
                break;
        }
        iScanner.close();
    }
}
