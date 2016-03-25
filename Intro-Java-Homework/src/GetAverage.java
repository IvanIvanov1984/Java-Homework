import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        float firstNum = console.nextFloat();
        float secondNum = console.nextFloat();
        float thirdNum = console.nextFloat();
        averageNum(firstNum, secondNum, thirdNum);
    }

    private static void averageNum(float firstNum, float secondNum, float thirdNum) {
        float result = (firstNum + secondNum + thirdNum) / 3;
        System.out.printf("%.2f", result);
    }
}