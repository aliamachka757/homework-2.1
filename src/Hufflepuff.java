public class Hufflepuff extends Hogwarts {
    private boolean loyal;
    private boolean patient;

    public Hufflepuff(String name, int age, boolean loyal, boolean patient) {
        super(name, age);
        this.loyal = loyal;
        this.patient = patient;
    }

    public boolean isLoyal() {
        return loyal;
    }

    public boolean isPatient() {
        return patient;
    }

    @Override
    public int compareStudents(Hufflepuff other) {
        int thisSum = (this.isLoyal() ? 1 : 0) + (this.isPatient() ? 1 : 0);
        int otherSum = (other.isLoyal() ? 1 : 0) + (other.isPatient() ? 1 : 0);
        return Integer.compare(thisSum, otherSum);
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
