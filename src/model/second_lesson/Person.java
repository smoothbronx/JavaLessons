package model.second_lesson;

public class Person {

    private String name;
    private int age;

    public Person ()
    {
        this("Undefined", 0);
    }

    public Person (String name) {
        this(name, 0);
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo () {
        System.out.println("Name: " + '\t' + name + '\n' + "Age: " + '\t' + age + '\n');
    }
}

