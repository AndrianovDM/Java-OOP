package Homework5.Data;

public class Ssd extends Details{
    
    private String memory;

    public Ssd(String name, String procreator, String memory) {
        super(name, procreator);
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("SSD: {%s, %s, %s}", getName(), getProcreator(), getMemory());
    }   
}
