package Homework3.src.controllers;

import Homework3.src.data.Human;
import Homework3.src.data.Relation;
import Homework3.src.data.Relative;
import Homework3.src.service.Service;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Service service;

    public Controller() {
        this.service = new Service();
    }

    public List<Human> getFindHumanByNameSurname(List<Human> list, String name, String surname) { 
        return service.findHuman(list, name, surname);
    }

    public List<Relative> getHumanRelative(List<Relative> listRelativeMain, String name, String surname){
        return service.getHumansRelative(listRelativeMain, name, surname);
    }

    public List<Human> findHuman(List<Human> list, String name, String surname) {
        List<Human> human = new ArrayList<>();
        for (Human h : list) {
            if (h.getName().equals(name) && h.getSurname().equals(surname)) {
                human.add(h);
            }
        }
        return human;
    }

    public List<Relative> searchByStatus(Human person, Relation status, List<Relative> rltList) {
        List<Relative> response = new ArrayList<>();
        for (Relative r : rltList) {
            if (r.getFirstHuman().equals(person) && r.getRelation().equals(status)) {
                response.add(r);
            }
        }
        return response;
    }
}