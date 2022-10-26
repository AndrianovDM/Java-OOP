package Homework5.Service;

import java.util.List;

import Homework5.Data.Processor;

public class ProcessorService implements Filter<Processor>{
    @Override
    public Processor getFilteredDetails(List<Processor> arrList, String filter){
        Processor val = null;
        for (var item : arrList) {
            if (item.getName().equals(filter)) {
                val = item;
            } else if (item.getPeriodicity().equals(filter)) {
                val = item;
            } else if (item.getProcreator().equals(filter)) {
                val = item;
            }
        }
        return val;
    }
}
