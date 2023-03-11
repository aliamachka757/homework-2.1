
public class Slytherin extends Hogwarts {
    private boolean cunning;
    private boolean ambitious;

    public Slytherin(String name, int age, boolean cunning, boolean ambitious) {
        super(name, age);
        this.cunning = cunning;
        this.ambitious = ambitious;
    }

    public boolean isCunning() {
        return cunning;
    }

    public boolean isAmbitious() {
        return ambitious;
    }

    public int compareStudents(Slytherin other) {
        int thisSum = (this.isCunning() ? 1 : 0) + (this.isAmbitious() ? 1 : 0);
        int otherSum = (other.isCunning() ? 1 : 0) + (other.isAmbitious() ? 1 : 0);
        return Integer.compare(thisSum, otherSum);
    }

    @Override
    public int compareStudents(Hufflepuff other) {
        return 0;
    }

    @Override
    protected boolean isChivalrous() {
        return false;
    }

    @Override
    protected boolean isBrave() {
        return false;
    }
}
