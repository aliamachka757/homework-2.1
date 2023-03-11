public class Gryffindor extends Hogwarts {
    private boolean brave;
    private boolean chivalrous;

    public Gryffindor(String name, int age, boolean brave, boolean chivalrous) {
        super(name, age);
        this.brave = brave;
        this.chivalrous = chivalrous;
    }

    public boolean isBrave() {
        return brave;
    }

    @Override
    public int compareStudents(Hufflepuff other) {
        return 0;
    }

    public boolean isChivalrous() {
        return chivalrous;
    }

    public int compareStudents(Gryffindor other) {
        int thisSum = (this.isBrave() ? 1 : 0) + (this.isChivalrous() ? 1 : 0);
        int otherSum = (other.isBrave() ? 1 : 0) + (other.isChivalrous() ? 1 : 0);
        return Integer.compare(thisSum, otherSum);
    }
}
