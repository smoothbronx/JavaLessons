public class MainClass {
    public static void main(String[] args) {
        short a = 2*2;
        int b = (int) a;
        System.out.println(b);
    }
}

/*  Преобразование данных
        Неявные
            byte a = 120
            short b = (short) (a * 2)
            int c = 2 * a
            long d = 4 + c
            int e = d + a
            float f = 4 + d + 3
            double g = f + 10
            byte h = (byte) g
        Явные
            byte h = (byte) g

        Other
            = - оператор присваивания
            Арифметические выражения
                +,-,%,/
 */