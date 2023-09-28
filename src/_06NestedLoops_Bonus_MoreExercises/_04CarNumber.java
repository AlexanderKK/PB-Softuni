package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());

        for (int i = firstDigit; i <= secondDigit; i++) {
            for (int j = firstDigit; j <= secondDigit; j++) {
                for (int k = firstDigit; k <= secondDigit; k++) {
                    for (int l = firstDigit; l <= secondDigit; l++) {
                        if(i % 2 != 0 && l % 2 == 0 || i % 2 == 0 && l % 2 != 0) {
                            if(i > l && (j + k) % 2 == 0) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
    }
}