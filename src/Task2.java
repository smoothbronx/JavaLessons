import java.util.Scanner;

// day - 1 mod 7 + 1
// day % 7 + 1
public class Task2 {
    public static void main(String[] args) {
        System.out.print("Write your day: ");
        Scanner scanner = new Scanner(System.in);
        short day = scanner.nextShort();
        byte dayOfWeek = (byte) (Math.floorMod((day - 1), 7) + 1);
        System.out.printf("Вашему %d дню соответствует %d день недели.", day, dayOfWeek);
    }

}
