package Homework5.Data;

public class Processor extends Details{
    
    private String periodicity;

    public Processor(String name, String procreator, String periodicity) {
        super(name, procreator);
        this.periodicity = periodicity;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return String.format("CPU: {%s, %s, %s}", getName(), getProcreator(), getPeriodicity());
    }
     
}
