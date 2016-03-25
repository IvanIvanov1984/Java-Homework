import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] split = str.split("\\s+");
        if (split.length % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 0; i < split.length; i += 2) {
            firstNum = Integer.parseInt(split[i]);
            secondNum = Integer.parseInt(split[i + 1]);
            System.out.print(firstNum + ", " + secondNum + " -> ");
            if ((firstNum % 2 == 0 && secondNum % 2 == 0) || (firstNum % 2 != 0 && secondNum % 2 != 0)) {
                if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                    System.out.println("both are even");
                } else {
                    System.out.println("both are odd");
                }
            } else {
                System.out.println("different");
            }
        }
    }
}