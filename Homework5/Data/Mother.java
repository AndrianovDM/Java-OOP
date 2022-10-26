package Homework5.Data;

public class Mother extends Details{

    String yearСreation;

    public Mother(String name, String procreator, String yearСreation) {
        super(name, procreator);
        this.yearСreation = yearСreation;
    }

    public String getYearСreation() {
        return yearСreation;
    }

    public void setYearСreation(String yearСreation) {
        this.yearСreation = yearСreation;
    }

    @Override
    public String toString() {
        return String.format("Mother: {%s, %s, %s}", getName(), getProcreator(), getYearСreation());
    }    
}
