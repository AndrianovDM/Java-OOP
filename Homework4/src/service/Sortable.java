package Homework4.src.service;

import java.util.List;
import Homework4.src.data.Computer;

public interface Sortable <T extends Computer>{
    public List<T> sort(List<T> list);
}
