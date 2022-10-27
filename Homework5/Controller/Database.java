package Homework5.Controller;

import java.util.ArrayList;
import java.util.List;

import Homework5.Data.Mother;
import Homework5.Data.Processor;
import Homework5.Data.Ram;
import Homework5.Data.Ssd;
import Homework5.Data.VideoCard;

public class Database {
    public List<Mother> m = new ArrayList<Mother>();
    public List<Processor> p = new ArrayList<Processor>();
    public List<Ram> r = new ArrayList<Ram>();
    public List<Ssd> s = new ArrayList<Ssd>();
    public List<VideoCard> v = new ArrayList<VideoCard>();


    public Database() {
        m.add(new Mother("PRIME X299-DELUXE", "Asus", "2020"));
        m.add(new Mother("B350 TOMAHAWK", "MSI", "2022"));
        m.add(new Mother("Z390", "GIGABYTE", "2020"));
        m.add(new Mother("Fatal1ty Z270 Gaming K4", "Asrock", "2019"));

        p.add(new Processor("Ryzen 5", "AMD", "3600"));
        p.add(new Processor("Ryzen 5", "AMD", "2600"));
        p.add(new Processor("Core i5-11400F", "Intel", "2600"));
        p.add(new Processor("Core i9-12900KF", "Intel", "3600"));
        
        r.add(new Ram("HYPERX PREDATOR", "KINGSTON", "4"));
        r.add(new Ram("VENGEANCE LPX", "CORSAIR", "8"));
        r.add(new Ram("VENGEANCE LED", "CORSAIR", "4"));
        r.add(new Ram("HYPERX FURY", "KINGSTON", "2"));

        s.add(new Ssd("Samsung", "870 EVO SATA 2.5", "512"));
        s.add(new Ssd("Crucial", "MX500", "1"));
        s.add(new Ssd("Kingston", "KC2500", "512"));
        s.add(new Ssd("Samsung", "980 PRO", "512"));

        v.add(new VideoCard("NVIDIA", "GeForce RTX 4090", "8"));
        v.add(new VideoCard("NVIDIA", "GeForce RTX 3090 Ti", "4"));
        v.add(new VideoCard("AMD", "Radeon RX 6950 XT", "8"));
        v.add(new VideoCard("AMD", "Radeon RX 6900 XT", "4"));}

        @Override
        public String toString() {
            return String.format("Base: %s, %s, %s, %s, %s", m.toString(), p.toString(), r.toString(), s.toString(), v.toString());
        }
}
