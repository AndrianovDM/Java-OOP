package Homework4.src.service;

import Homework4.src.data.Desktop;
import Homework4.src.data.Memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class DesktopService implements Sortable<Desktop>, Printable<Desktop> {

    @Override
    public void print(List<Desktop> list) {
        Logger lg = Logger.getAnonymousLogger();
        lg.info(list.toString());
    }

    @Override
    public List<Desktop> sort(List<Desktop> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }

    public List<Desktop> FindAndWriteValue(List<Desktop> list, String field, String value){
        List<Desktop> filterList = new ArrayList<>();

        for (Desktop desktop: list){
            switch(field){
                case "id":
                    if(desktop.getId().equals(value)){
                        filterList.add(desktop);
                    }
                break;
                
                case "model":
                    if(desktop.getModel().equals(value)){
                        filterList.add(desktop);
                    }
                break;

                case "memory":
                    if(desktop.getMemory().equals(Memory.valueOf(value))){
                        filterList.add(desktop);
                }
                break;

                case "ssd":
                    if(desktop.getSsd().equals(value)){
                        filterList.add(desktop);
                }
                break;

                case "power":
                    if(desktop.getPower().equals(Integer.valueOf((value)))) {
                        filterList.add(desktop);
                    }
                }
        }
        return filterList;
    }
}
