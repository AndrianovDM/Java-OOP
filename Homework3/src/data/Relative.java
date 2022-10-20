package Homework3.src.data;

public class Relative {
    private Human firstHuman;
    private Human secondHuman;
    private Relation relation;

    public Relative(Human firstHuman, Relation relation, Human secondHuman) {
        this.firstHuman = firstHuman;
        this.secondHuman = secondHuman;
        this.relation = relation;
    }

    public Human getFirstHuman() {
        return firstHuman;
    }

    public  void setFirstHuman(Human firstHuman) {
        this.firstHuman = firstHuman;
    }

    public Human getSecondHuman() {
        return secondHuman;
    }

    public void setSecondHuman(Human secondHuman) {
        this.secondHuman = secondHuman;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return String.format("%s %s of %s", firstHuman, relation, secondHuman);
        }
}
