package Homework5.Data;

public class Computer {
    private Mother mother;
    private Processor cpu;
    private Ram ram;
    private Ssd ssd; 
    private VideoCard videoCard;
    public Computer(Mother mother, Processor cpu, Ram ram, Ssd ssd, VideoCard videoCard) {
        this.mother = mother;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.videoCard = videoCard;
    }
    public Mother getMother() {
        return mother;
    }
    public void setMother(Mother mother) {
        this.mother = mother;
    }
    public Processor getCpu() {
        return cpu;
    }
    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }
    public Ram getRam() {
        return ram;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    public Ssd getSsd() {
        return ssd;
    }
    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }
    public VideoCard getVideoCard() {
        return videoCard;
    }
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
    @Override
    public String toString() {
        return String.format("Pc: {%s, %s, %s, %s,%s}", mother, cpu, ram, ssd, videoCard);
    }  
}
