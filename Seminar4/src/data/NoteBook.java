package Seminar4.src.data;

public class NoteBook extends Computer{

    private Integer batteryCapacity;

    public NoteBook(String id, String model, Memory memory, String ssd, Integer batteryCapacity){
        super(id, model, memory, ssd);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString(){
        return "NoteBook id: " + getId() + 
               " ,Model: " + getModel() + 
               " ,Memory: " + getMemory() + " Gb" +
               " ,SSD: " + getSsd() + " Gb"+
               " ,BatteryCapacity: " + getBatteryCapacity();
    }
}
