import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();

        String firstHex = Integer.toHexString(a).toUpperCase();
        String firstBin = String.format("%010d", Integer.parseInt(Integer.toBinaryString(a)));
        String second = String.format("%.2f", b);
        String third = String.format("%.3f", c);

        System.out.printf("|%-10.10s|" + firstBin + "|%10.10s|%-10.10s|", firstHex, second, third);
    }
}