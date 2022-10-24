package Seminar4.src.data;

public class Desktop extends Computer{

    private Integer power;

    public Desktop(String id, String model, Memory memory, String ssd, Integer power){
        super(id, model, memory, ssd);
        this.power = power;
    }

    public Integer getPower(){
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString(){
        return "Desktop id: " + getId() + 
               " ,Model: " + getModel() + 
               " ,Memory: " + getMemory() + " Gb" +
               " ,SSD: " + getSsd() + " Gb"+
               " ,Power: " + getPower();
    }  
}
