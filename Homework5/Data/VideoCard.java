package Homework5.Data;

public class VideoCard extends details{
    String retention;

    public VideoCard(String name, String procreator, String retention) {
        super(name, procreator);
        this.retention = retention;
    }

    public String getRetention() {
        return retention;
    }

    public void setRetention(String retention) {
        this.retention = retention;
    }

    @Override
    public String toString() {
        return String.format("VideoCard: {%s, %s, %i}", getName(), getProcreator(), getRetention());
    }   
}
