import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum = console.nextInt();
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == userNum) {
                    System.out.println(i + " + " + j + " = " + userNum);
                }
            }
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == userNum) {
                    System.out.println(i + " - " + j + " = " + userNum);
                }
            }
        }
    }
}