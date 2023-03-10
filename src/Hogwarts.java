public class Hogwarts {
    private String name;
    private int age;

    public Hogwarts(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("All Hogwarts students study hard!");
    }

    public void playQuidditch() {
        System.out.println("All Hogwarts students love playing Quidditch!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}