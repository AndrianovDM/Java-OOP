package Homework5.Data;

public class Mother extends details{

    Integer yearСreation;

    public Mother(String name, String procreator, Integer yearСreation) {
        super(name, procreator);
        this.yearСreation = yearСreation;
    }

    public Integer getYearСreation() {
        return yearСreation;
    }

    public void setYearСreation(Integer yearСreation) {
        this.yearСreation = yearСreation;
    }

    @Override
    public String toString() {
        return String.format("Mother: {%s, %s, %i}", getName(), getProcreator(), getYearСreation());
    }    
}
