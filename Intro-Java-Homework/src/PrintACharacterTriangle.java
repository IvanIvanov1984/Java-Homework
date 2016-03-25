import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum = console.nextInt();
        for (int a = 1; a <= userNum; a++) {
            char someChar = 'a';
            for (int b = 0; b < a; b++) {
                System.out.print(someChar + " ");
                someChar += 1;
            }
            System.out.println();
        }
        for (int a = userNum; a > 0; a--) {
            char someChar = 'a';
            for (int b = a - 1; b > 0; b--) {
                System.out.print(someChar + " ");
                someChar += 1;
            }
            if (a > 1) {
                System.out.println();
            }
        }
    }
}