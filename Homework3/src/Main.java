package Homework3.src;

import Homework3.src.data.Human;
import Homework3.src.data.Relative;
import Homework3.src.service.ListData;
import Homework3.src.service.View;
import Homework3.src.controllers.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    Scanner scannerM = new Scanner(System.in);
    List<Human> listHumanM = new ArrayList<>();
    List<Relative> listRelativeM = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        ListData loaderM = new ListData();
        Controller controllerM = new Controller();
        loaderM.ListDataHumanRelative(main.listHumanM, main.listRelativeM);
        main.menu(main.scannerM, controllerM);
        main.scannerM.close();
    }

    void menu(Scanner Scan, Controller Controll) {
        View visual = new View();
        String userMenuChoice;
        do {
            visual.printMenu();
            userMenuChoice = Scan.next();
            switch (userMenuChoice) {
                case "1": // 1. Вывести информацию по людям
                    visual.printFullHumanList(listHumanM);
                    break;
                case "2": // 2. Найти человека
                    searchMenu(Scan, visual, Controll);
                    break;
                case "3":
                    visual.printFullRelativesList(listRelativeM);
                    break;
                case "0":
                    userMenuChoice = "exit";
                    break;
                default:
                    System.out.println("Wrong input.");
                    break;
            }
            scannerM.reset();
        } while (!userMenuChoice.equals("exit"));
    }

    void searchMenu(Scanner Scan, View visual, Controller Controll) {
        System.out.print("Enter name: ");
        String name = Scan.next();
        System.out.print("Enter surname: ");
        String surname = Scan.next();
        List<Human> tmp = Controll.getFindHumanByNameSurname(listHumanM, name, surname);
        if (tmp.size() > 0)
        visual.printFullHumanList(tmp);
        else System.out.println("Nobody found");
        Scan.reset();
    }
}