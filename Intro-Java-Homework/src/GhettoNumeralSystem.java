import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum = console.nextInt();
        List<Integer> digit = new ArrayList<>();
        while (userNum > 0) {
            digit.add(userNum % 10);
            userNum /= 10;
        }
        for (int i = digit.size() - 1; i >= 0; i--) {
            int number = digit.get(i);
            switch (number) {
                case 0:
                    System.out.print("Gee");
                    break;
                case 1:
                    System.out.print("Bro");
                    break;
                case 2:
                    System.out.print("Zuz");
                    break;
                case 3:
                    System.out.print("Ma");
                    break;
                case 4:
                    System.out.print("Duh");
                    break;
                case 5:
                    System.out.print("Yo");
                    break;
                case 6:
                    System.out.print("Dis");
                    break;
                case 7:
                    System.out.print("Hood");
                    break;
                case 8:
                    System.out.print("Jam");
                    break;
                case 9:
                    System.out.print("Mack");
                    break;
            }
        }
    }
}