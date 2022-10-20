package Homework3.src.service;

import Homework3.src.data.Human;
import Homework3.src.data.Relative;
import java.util.List;

public class View {

    public void printMenu() {
        String menu = "\n\n" +
                "Выберете действие:\n" +
                "1. Вывести информацию по людям\n" +
                "2. Найти человека\n" +
                "3. Вывести полную информацию о родственниках\n" +
                "0: Выход\n" + "_> ";
        System.out.println(menu);
    }

    public void printFullHumanList(List<Human> list){
        for (Human person : list) {
            System.out.println(person);
        }
    }

    public void printFullRelativesList(List<Relative> rtlList) {
        for (Relative pair : rtlList)
            System.out.println(pair);
    }
}
