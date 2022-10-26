package Homework5.Service;

import java.util.List;

import Homework5.Data.Mother;

public class MotherService implements Filter<Mother>{
    @Override
    public Mother getFilteredDetails(List<Mother> arrList, String filter){
        Mother val = null;
        for (var item : arrList) {
            if (item.getName().equals(filter)) {
                val = item;
            } else if (item.getProcreator().equals(filter)) {
                val = item;
            } else if (item.getYearСreation().equals(filter)) {
                val = item;
            }
        }
        return val;
    }
}
