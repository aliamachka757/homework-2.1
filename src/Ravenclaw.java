public class Ravenclaw extends Hogwarts {
    private boolean intelligent;
    private boolean wise;

    public Ravenclaw(String name, int age, boolean intelligent, boolean wise) {
        super(name, age);
        this.intelligent = intelligent;
        this.wise = wise;
    }

    public void displayStudentInfo() {
        System.out.println("Student name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Intelligent: " + intelligent);
        System.out.println("Wise: " + wise);
        study();
        playQuidditch();
    }

    public boolean isIntelligent() {
        return intelligent;
    }

    public boolean isWise() {
        return wise;
    }
}
