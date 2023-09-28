package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLev = Integer.parseInt(scanner.nextLine());
        int twoLeva = Integer.parseInt(scanner.nextLine());
        int fiveLeva = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLev; i++) {
            for (int j = 0; j <= twoLeva; j++) {
                for (int k = 0; k <= fiveLeva; k++) {
                    if(i + j * 2 + k * 5 == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, amount);
                    }
                }
            }
        }
    }
}