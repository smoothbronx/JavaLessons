import model.second_lesson.Fraction;
// import model.second_lesson.Person;

// import static methods
// import static java.lang.Math.*;
// Math.sqrt() -> sqrt()

public class Second_Lesson {

//    static block or static initializator
/*    static {
        System.out.println("Hello, Static World!");
    } */

    public static void main(String[] args) {
//        Person first_person = new Person();
//        first_person.displayInfo();
//        Person second_person = new Person("Vladislav");
//        second_person.displayInfo();
//        Person third_person = new Person("Vladislav", 17);
//        third_person.displayInfo();

        Fraction first_fraction = new Fraction(19, 4);
        Fraction second_fraction = new Fraction(1, 4);
        Fraction final_fraction = first_fraction.Plus(second_fraction);
        final_fraction.display_fraction();
        final_fraction.simplify();
        final_fraction.display_fraction();
        final_fraction.display();


    }
}
