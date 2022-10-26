package Homework5.Data;

public class Ram extends details{
    Integer memory;

    public Ram(String name, String procreator, Integer memory) {
        super(name, procreator);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("RAM: {%s, %s, %i}", getName(), getProcreator(), getMemory());
    }
    
    
}
