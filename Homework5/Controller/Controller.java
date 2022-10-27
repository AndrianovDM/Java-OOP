package Homework5.Controller;
import java.util.logging.Logger;
import java.util.Scanner;

public class Controller {
    ComputerBuilder compBuild = new ComputerBuilder();
    Database base = new Database();

    public void start(){
        Logger logger = Logger.getAnonymousLogger();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nВыберете:\n" +
        "1 - показать запчасти компьютера\n" +
        "2 - создать сборку компьютера\n");

        int action = iScanner.nextInt();
        iScanner.nextLine();

        switch (action) {
            case 1:
                logger.info(base.toString());
                break;
            case 2:
                System.out.println("\nВыберете материнскую плату:\n");
                String ms = iScanner.nextLine();
                compBuild.setMother(base.mothers, ms);

                System.out.println("\nВыберете процессор:\n");
                String ps = iScanner.nextLine();
                compBuild.setProcessor(base.processors, ps);

                System.out.println("\nВыберете оперативную память:\n");
                String rs = iScanner.nextLine();
                compBuild.setRam(base.rams, rs);

                System.out.println("\nВыберете SSD диск:\n");
                String ss = iScanner.nextLine();
                compBuild.setSsd(base.ssds, ss);

                System.out.println("\nВыберете видеокарту:\n");
                String vs = iScanner.nextLine();
                compBuild.setVideoCard(base.videoCards, vs);

                logger.info(compBuild.toString());
                break;
            default:
                logger.info("Неверные данные!");
                break;
        }
        iScanner.close();
    }
}
