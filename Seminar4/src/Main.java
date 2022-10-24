package Seminar4.src;

import Seminar4.src.controller.NotebookController;
import Seminar4.src.controller.DesktopController;
import Seminar4.src.data.Memory;
import Seminar4.src.data.NoteBook;
import Seminar4.src.data.Desktop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook("14", "Air", Memory.ONE, "256", 1000);
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.SIXTEEN, "512", 1200);
        NoteBook n3 = new NoteBook("3", "Asus", Memory.TWO, "512", 1100);

        ArrayList<NoteBook> nb = new ArrayList<>();
        nb.add(n1);
        nb.add(n2);
        nb.add(n3);

        Desktop d1 = new Desktop("12", "HP", Memory.FOUR, "1024", 300);
        Desktop d2 = new Desktop("1", "Dell", Memory.SIXTEEN, "1024", 500);
        Desktop d3 = new Desktop("24", "Irbis", Memory.TWO, "512", 450);

        ArrayList<Desktop> dp = new ArrayList<>();
        dp.add(d1);
        dp.add(d2);
        dp.add(d3);

        NotebookController notebookController = new NotebookController();
        DesktopController  desktopController = new DesktopController();

        notebookController.printInLogNotebooks(notebookController.getFilteredNotebookList(nb, "model", ""));
        desktopController.printInLogDesktops(desktopController.getFilteredDesktopList(dp, "power", "450"));
    }
}
