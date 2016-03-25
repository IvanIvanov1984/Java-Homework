import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum = console.nextInt();
        String base7Num = Integer.toString(userNum, 7);
        System.out.println(base7Num);
    }
}