package Homework4.src.service;

import java.util.List;
import Homework4.src.data.Computer;

public interface Printable <T extends Computer>{
    public void print(List<T> list);
}

