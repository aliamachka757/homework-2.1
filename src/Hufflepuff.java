public class Hufflepuff extends Hogwarts {
    private boolean loyal;
    private boolean hardworking;

    public Hufflepuff(String name, int age, boolean loyal, boolean hardworking) {
        super(name, age);
        this.loyal = loyal;
        this.hardworking = hardworking;
    }

    public void displayStudentInfo() {
        System.out.println("Student name " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Loyal: " + loyal);
        System.out.println("Hardworking: " + hardworking);
        study();
        playQuidditch();
    }

    public boolean isLoyal() {
        return loyal;
    }

    public boolean isHardworking() {
        return hardworking;
    }
}