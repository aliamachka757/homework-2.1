
public class Slytherin extends Hogwarts {
    private boolean ambitious;
    private boolean cunning;

    public Slytherin(String name, int age, boolean ambitious, boolean cunning) {
        super(name, age);
        this.ambitious = ambitious;
        this.cunning = cunning;
    }

    public void displayStudentInfo() {
        System.out.println("Student name " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Ambitious: " + ambitious);
        System.out.println("Cunning: " + cunning);
        study();
        playQuidditch();
    }

    public boolean isAmbitious() {
        return ambitious;
    }

    public boolean isCunning() {
        return cunning;
    }
}