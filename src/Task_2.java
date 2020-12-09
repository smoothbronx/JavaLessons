import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), p = scanner.nextDouble();
        System.out.printf("Ваши переменные x и p равны %.2f и %.2f соответственно\ny = %.2f\na = %.2f\nb = %.2f", x, p, Math.pow(x, 3) / Math.pow(p, 3), Math.exp(Math.sqrt(Math.abs(x))), Math.sin(Math.pow(p, 2)) + Math.pow(x, 3));
    }
}
