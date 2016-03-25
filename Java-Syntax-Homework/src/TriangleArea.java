import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] firstSplit = console.nextLine().split("\\s+");
        String[] secondSplit = console.nextLine().split("\\s+");
        String[] thirdSplit = console.nextLine().split("\\s+");

        int firstX = Integer.parseInt(firstSplit[0]);
        int firstY = Integer.parseInt(firstSplit[1]);
        int secondX = Integer.parseInt(secondSplit[0]);
        int secondY = Integer.parseInt(secondSplit[1]);
        int thirdX = Integer.parseInt(thirdSplit[0]);
        int thirdY = Integer.parseInt(thirdSplit[1]);

        int area = (firstX * (secondY - thirdY) + secondX * (thirdY - firstY) + thirdX * (firstY - secondY)) / 2;
        if (area < 0) {
            area *= -1;
        }
        System.out.println(area);
    }
}