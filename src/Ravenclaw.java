public class Ravenclaw extends Hogwarts {
    private boolean intelligent;
    private boolean curious;

    public Ravenclaw(String name, int age, boolean intelligent, boolean curious) {
        super(name, age);
        this.intelligent = intelligent;
        this.curious = curious;
    }

    public boolean isIntelligent() {
        return intelligent;
    }

    public boolean isCurious() {
        return curious;
    }

    public int compareStudents(Ravenclaw other) {
        int thisSum = (this.isIntelligent() ? 1 : 0) + (this.isCurious() ? 1 : 0);
        int otherSum = (other.isIntelligent() ? 1 : 0) + (other.isCurious() ? 1 : 0);
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
