import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t, v;
        double c = scanner.nextDouble(), l = scanner.nextDouble();
        t = (2*Math.PI) * Math.sqrt(l*c);
        v = 1/t;
        System.out.printf("Переменные C и L равны %.2f и %.2f соответсвенно\nT = %.2f\nv = %.2f", c, l, t, v);
    }
}
