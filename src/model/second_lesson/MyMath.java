package model.second_lesson;
import static java.lang.Math.pow;

public class MyMath {
    public static final double PI = 3.14;

    public static double perimeter (double radius) {
        return 2*PI*radius;
    }

    public static double area (double radius) {
        return PI*pow(radius, 2);
    }
}
