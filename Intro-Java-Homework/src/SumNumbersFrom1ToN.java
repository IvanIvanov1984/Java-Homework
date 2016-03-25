import java.util.Scanner;

public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum = console.nextInt();
        int result = 0;
        for (int i = 1; i <= userNum; i++) {
            result += i;
        }
        System.out.println(result);
    }
}