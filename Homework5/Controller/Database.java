package Homework5.Controller;

import java.util.ArrayList;
import java.util.List;

import Homework5.Data.Mother;
import Homework5.Data.Processor;
import Homework5.Data.Ram;
import Homework5.Data.Ssd;
import Homework5.Data.VideoCard;

public class Database {
    public List<Mother> mothers = new ArrayList<Mother>();
    public List<Processor> processors = new ArrayList<Processor>();
    public List<Ram> rams = new ArrayList<Ram>();
    public List<Ssd> ssds = new ArrayList<Ssd>();
    public List<VideoCard> videoCards = new ArrayList<VideoCard>();


    public Database() {
        mothers.add(new Mother("PRIME X299-DELUXE", "Asus", "2002"));
        mothers.add(new Mother("B350 TOMAHAWK", "MSI", "2019"));
        mothers.add(new Mother("Z390", "GIGABYTE", "2021"));
        mothers.add(new Mother("Fatal1ty Z270 Gaming K4", "Asrock", "2019"));
        
        processors.add(new Processor("Ryzen 5", "AMD", "3800"));
        processors.add(new Processor("Core i5-11400F", "Intel", "2600"));
        
        rams.add(new Ram("HYPERX PREDATOR", "KINGSTON", "4"));
        rams.add(new Ram("VENGEANCE LPX", "CORSAIR", "8"));
        rams.add(new Ram("VENGEANCE LED", "CORSAIR", "16"));

        ssds.add(new Ssd("870 EVO SATA 2.5", "Samsung", "512"));
        ssds.add(new Ssd("MX500", "Crucial", "1"));
        ssds.add(new Ssd("KC2500","Kingston", "2"));

        videoCards.add(new VideoCard("GeForce RTX 4090", "NVIDIA", "8"));
        videoCards.add(new VideoCard("Radeon RX 6950 XT", "AMD", "4"));}

        @Override
        public String toString() {
            return String.format("Base: %s, %s, %s, %s, %s", mothers.toString(), processors.toString(), rams.toString(), ssds.toString(), videoCards.toString());
        }
}
