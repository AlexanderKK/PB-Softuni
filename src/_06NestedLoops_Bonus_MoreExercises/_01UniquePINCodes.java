package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstDigit; i++) {
            for (int j = 1; j <= secondDigit; j++) {
                for (int k = 1; k <= thirdDigit; k++) {
                    if(i % 2 == 0 && k % 2 == 0) {
                        int counter = 0;
                        for (int l = 1; l <= j; l++) {
                            if(j % l == 0) {
                                counter++;
                            }
                        }
                        if(counter == 2) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}