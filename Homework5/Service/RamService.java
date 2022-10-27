package Homework5.Service;

import java.util.List;

import Homework5.Data.Ram;

public class RamService implements Filter<Ram>{
    @Override
    public Ram getFilteredDetails(List<Ram> arrList, String filter){
        Ram val = null;
        for (var item : arrList) {
            if (item.getName().equals(filter)) {
                val = item;
            } else if (item.getProcreator().equals(filter)) {
                val = item;
            } else if (item.getMemory().equals(filter)) {
                val = item;
            }
        }
        return val;
    }
}

