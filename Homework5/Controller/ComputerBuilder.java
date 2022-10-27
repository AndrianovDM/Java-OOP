package Homework5.Controller;

import java.util.List;

import Homework5.Data.Computer;
import Homework5.Data.Mother;
import Homework5.Data.Processor;
import Homework5.Data.Ram;
import Homework5.Data.Ssd;
import Homework5.Data.VideoCard;
import Homework5.Service.MotherService;
import Homework5.Service.ProcessorService;
import Homework5.Service.RamService;
import Homework5.Service.SsdService;
import Homework5.Service.VideoCardService;

public class ComputerBuilder {
    
    private Computer pc = new Computer(null, null, null,null,null);

    MotherService ms = new MotherService();
    ProcessorService ps = new ProcessorService();
    RamService rs = new RamService();
    SsdService ss = new SsdService();
    VideoCardService vs = new VideoCardService();

    public ComputerBuilder(){
    }

    public void setMother(List<Mother> arrList, String value){
        pc.setMother(ms.getFilteredDetails(arrList, value));
    }

    public void setProcessor(List<Processor> arrList, String value){
        pc.setCpu(ps.getFilteredDetails(arrList, value));
    }

    public void setRam(List<Ram> arrList, String filter){
        pc.setRam(rs.getFilteredDetails(arrList, filter));
    }

    public void setSsd(List<Ssd> arrList, String filter){
        pc.setSsd(ss.getFilteredDetails(arrList, filter));
    }

    public void setVideoCard(List<VideoCard> arrList, String filter){
        pc.setVideoCard(vs.getFilteredDetails(arrList, filter));
    }

    @Override
    public String toString() {
        return String.format("Personal computer is: %s, %s, %s, %s, %s", pc.getMother().toString(), pc.getCpu().toString(),
        pc.getRam().toString(), pc.getSsd().toString(), pc.getVideoCard().toString());
    }
}




