import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        double formula1 = Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c)));
        double formula2 = Math.pow((a * a + b * b - c * c * c), a - b);
        double difference = ((a + b + c) / 3) - ((formula1 + formula2) / 2);
        if (difference < 0) {
            difference *= -1;
        }
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1, formula2, difference);
    }
}