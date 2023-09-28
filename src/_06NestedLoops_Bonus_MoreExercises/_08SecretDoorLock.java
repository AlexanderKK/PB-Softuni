package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _08SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstDigit; i++) {
            if(i % 2 == 0) {
                for (int prime = 1; prime <= secondDigit; prime++) {
                    int counter = 0;
                    for (int j = 1; j <= prime; j++) {
                        if(prime % j == 0) {
                            counter++;
                        }
                    }
                    if(counter == 2) {
                        for (int k = 1; k <= thirdDigit; k++) {
                            if(k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, prime, k);
                            }
                        }
                    }
                }
            }
        }
    }
}