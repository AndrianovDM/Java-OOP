package Homework5.Data;

public class Ram extends Details{
    
    private String memory;

    public Ram(String name, String procreator, String memory) {
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
        return String.format("RAM: {%s, %s, %s}", getName(), getProcreator(), getMemory());
    }
    
    
}
