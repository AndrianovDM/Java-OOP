package Homework4.src.controller;

import Homework4.src.data.NoteBook;
import Homework4.src.service.NotebookService;

import java.util.List;

public class NotebookController {
    private NotebookService notebookService;

    public  NotebookController(){
        this.notebookService = new NotebookService();
    }
    
    public List<NoteBook> getSortedByIdNotebook(List<NoteBook> list) {
        return notebookService.sort(list);
    }

    public void printInLogNotebooks(List<NoteBook> list) {
        notebookService.print(list);
    }

    public List<NoteBook> getFilteredNotebookList(List<NoteBook> list, String field, String value){
        return notebookService.FindAndWriteValue(list, field, value);
    }
}

