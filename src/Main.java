



public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Harry Potter", 17, true, true);
        Gryffindor ron = new Gryffindor("Ron Weasley", 17, true, false);
        Slytherin draco = new Slytherin("Draco Malfoy", 17, true, false);
        Ravenclaw luna = new Ravenclaw("Luna Lovegood", 16, false, true);

        // Compare Gryffindor students
        int result = harry.compareStudents(ron);
        if (result > 0) {
            System.out.println(harry.getName() + " is braver and more chivalrous than " + ron.getName());
        } else if (result < 0) {
            System.out.println(ron.getName() + " is braver and more chivalrous than " + harry.getName());
        } else {
            System.out.println(harry.getName() + " and " + ron.getName() + " are equally brave and chivalrous");
        }

        // Compare Slytherin students
        result = draco.compareStudents(new Slytherin("Vincent Crabbe", 17, true, false));
        if (result > 0) {
            System.out.println(draco.getName() + " is more cunning and ambitious than Vincent Crabbe");
        } else if (result < 0) {
            System.out.println("Vincent Crabbe is more cunning and ambitious than " + draco.getName());
        } else {
            System.out.println(draco.getName() + " and Vincent Crabbe are equally cunning and ambitious");
        }


        luna.study();
        luna.playQuidditch();
    }
}
