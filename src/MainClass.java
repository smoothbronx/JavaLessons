public class MainClass {
    public static void main(String[] args) {
//    while (count >= 0){
//        if (count % 100 == 0){
//            System.out.println(count);
//        }
//        else {
//            System.out.printf("%d ", count);
//        }
//        count--;
//    }
    for (int i=1; i<=9; i++) {
        for (int j = 1; j <= 9; j++){
            System.out.printf("%d x %d = %d\t", i, j, i*j);
        }
        System.out.println();
    }
}}

