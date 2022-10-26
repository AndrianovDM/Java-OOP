package Homework5.Data;

public class processor extends details{
    Integer periodicity;

    public processor(String name, String procreator, Integer periodicity) {
        super(name, procreator);
        this.periodicity = periodicity;
    }

    public Integer getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Integer periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return String.format("CPU: {%s, %s, %i}", getName(), getProcreator(), getPeriodicity());
    }
     
}
