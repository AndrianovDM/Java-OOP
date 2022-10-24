package Homework4.src.controller;

import Homework4.src.data.Desktop;
import Homework4.src.service.DesktopService;

import java.util.List;

public class DesktopController {
    private DesktopService desktopService;

    public DesktopController(){
        this.desktopService = new DesktopService();
    }
    
    public List<Desktop> getSortedByIdNotebook(List<Desktop> list) {
        return desktopService.sort(list);
    }

    public void printInLogDesktops(List<Desktop> list) {
        desktopService.print(list);
    }

    public List<Desktop> getFilteredDesktopList(List<Desktop> list, String field, String value){
        return desktopService.FindAndWriteValue(list, field, value);
    }
}
