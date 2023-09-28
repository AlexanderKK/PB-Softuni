package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _12DiamondReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while(n >= 0) {
            int upper = (n + 1) / 2;
            for (int i = 1; i <= upper; i++) {
                int leftRight = upper - i;   //Dashes (-)

                for (int j = 1; j <= leftRight; j++) {
                    System.out.print("-");
                }

                if (i == 1) {
                    for (int j = 1; j <= n - 2 * leftRight; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");

                    int mid = n - 2 * leftRight - 2;   //Middle dashes
                    for (int j = 1; j <= mid; j++) {
                        System.out.print("-");
                    }

                    System.out.print("*");
                }

                for (int j = 1; j <= leftRight; j++) {
                    System.out.print("-");
                }

                System.out.println();
            }

            int lower = (n - 1) / 2;
            for (int i = 1; i <= lower; i++) {
                int leftRight = i;

                for (int j = 1; j <= leftRight; j++) {
                    System.out.print("-");
                }

                if (i != lower) {
                    System.out.print("*");

                    int mid = n - 2 * leftRight - 2;   //Middle dashes
                    for (int j = 1; j <= mid; j++) {
                        System.out.print("-");
                    }

                    System.out.print("*");
                } else {
                    for (int j = 1; j <= n - 2 * leftRight; j++) {
                        System.out.print("*");
                    }
                }

                for (int j = 1; j <= leftRight; j++) {
                    System.out.print("-");
                }

                System.out.println();
            }

            System.out.println();
            n = Integer.parseInt(scanner.nextLine());
        }
    }
}