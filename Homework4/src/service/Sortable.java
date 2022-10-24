package Homework4.src.service;

import java.util.List;
import Seminar4.src.data.Computer;

public interface Sortable <T extends Computer>{
    public List<T> sort(List<T> list);
}
