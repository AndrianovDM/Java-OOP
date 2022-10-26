package Homework5.Service;

import java.util.List;

import Homework5.Data.Details;

public interface Filter <T extends Details> {
    public T getFilteredDetails(List<T> arrayList, String filter);
}
