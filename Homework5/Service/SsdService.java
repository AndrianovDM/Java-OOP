package Homework5.Service;

import java.util.List;

import Homework5.Data.Ssd;

public class SsdService implements Filter<Ssd>{
    @Override
    public Ssd getFilteredDetails(List<Ssd> arrList, String filter){
        Ssd val = null;
        for (var item : arrList) {
            if (item.getName().equals(filter)) {
                val = item;
            } else if (item.getMemory().equals(filter)) {
                val = item;
            } else if (item.getProcreator().equals(filter)) {
                val = item;
            }
        }
        return val;
    }
}