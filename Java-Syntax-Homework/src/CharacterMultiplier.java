import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] string = console.nextLine().split("\\s+");

        charMultiplier(string);
    }

    static void charMultiplier(String[] string) {
        char[] firstVar = string[0].toCharArray();
        char[] secondVar = string[1].toCharArray();
        int min = Math.min(firstVar.length, secondVar.length);
        int max = Math.max(firstVar.length, secondVar.length);
        int result = 0;
        for (int i = 0; i < min; i++) {
            result += (firstVar[i] * secondVar[i]);
        }
        if (min != max) {
            for (int i = min; i < max; i++) {
                if (firstVar.length > secondVar.length) {
                    result += firstVar[i];
                } else {
                    result += secondVar[i];
                }
            }
        }
        System.out.println(result);
    }
}