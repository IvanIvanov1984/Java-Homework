import java.util.*;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        if (n == m){
            System.out.print(n);
            return;
        }
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        Random r = new Random();
        boolean equals = true;
        int[] numbers = new int[(max - min) + 1];
        numbers[0] = r.nextInt((max - min) + 1) + min;
        for (int i = 1; i < numbers.length; i++) {
            int randomNumber = r.nextInt((max - min) + 1) + min;
            for (int j = i; j > 0; j--) {
                if (randomNumber != numbers[j - 1]){
                    equals = false;
                }else{
                    equals = true;
                    i--;
                    break;
                }
            }
            if(equals == false){
                numbers[i] = randomNumber;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}