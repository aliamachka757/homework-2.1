public class Gryffindor extends Hogwarts {
    private boolean brave;
    private boolean chivalrous;

    public Gryffindor(String name, int age, boolean brave, boolean chivalrous) {
        super(name, age);
        this.brave = brave;
        this.chivalrous = chivalrous;
    }

    public void displayStudentInfo() {
        System.out.println("Student name " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Brave: " + brave);
        System.out.println("Chivalrous: " + chivalrous);
        study();
        playQuidditch();
    }

    public boolean isBrave() {
        return brave;
    }

    public boolean isChivalrous() {
        return chivalrous;
    }
}
