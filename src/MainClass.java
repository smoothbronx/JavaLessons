import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        System.out.printf("Ваши два действительных числа: %.2f и %.2f\nСумма чисел: %.2f\nРазность чисел: %.2f\nПроизведение чисел: %.2f\nЧастное чисел: %.2f.", a, b, a+b, a-b, a*b, a/b);
    }
}
