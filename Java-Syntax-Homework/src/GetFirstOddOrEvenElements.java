import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String numbers = console.nextLine();
        String[] splitNum = numbers.split("\\s+");

        String string = console.nextLine();
        String[] splitStr = string.split("\\s+");
        int wantedNumbers = Integer.parseInt(splitStr[1]);
        boolean even = splitStr[2].equals("even");

        getNumbers(splitNum, wantedNumbers, even);
    }

    private static void getNumbers(String[] splitNum, int wantedNumbers, boolean even) {
        for (int i = 0; i < splitNum.length && wantedNumbers != 0; i++) {
            int number = Integer.parseInt(splitNum[i]);
            if (even) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                    wantedNumbers--;
                }
            } else {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                    wantedNumbers--;
                }
            }
        }
    }
}
