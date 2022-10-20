package Homework3.src.service;

import Homework3.src.data.Human;
import Homework3.src.data.Relative;
import java.util.List;
import java.util.ArrayList;

public class Service {


    public List<Human> findHuman(List<Human> list, String name, String surname) {
        List<Human> human = new ArrayList<>();
        for (Human people : list) {
            if (people.getName().equals(name) && people.getSurname().equals(surname)) {
                human.add(people);
            }
        }
        return human;
    }

    public List<Relative> getHumansRelative(List<Relative> listRelative, String name, String surname) {
        List<Relative> relativeListService = new ArrayList<>();
        for (Relative relative : listRelative) {
            if (relative.getFirstHuman().getName().equals(name) && relative.getFirstHuman().getSurname().equals(surname))
                relativeListService.add(relative);
        }
        return relativeListService;
    }
}