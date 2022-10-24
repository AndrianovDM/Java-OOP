package Homework4.src.service;
import Homework4.src.data.Computer;
import java.util.Comparator;

public class ComputerComparator implements Comparator<Computer>{
   
    public int compare(Computer computer1, Computer computer2) {
        if (Integer.valueOf(computer1.getId()) > Integer.valueOf(computer2.getId())){
            return 1;
        }

        if (Integer.valueOf(computer1.getId()) < Integer.valueOf(computer2.getId())){
            return -1;
        }
        return 0;
    }
}

