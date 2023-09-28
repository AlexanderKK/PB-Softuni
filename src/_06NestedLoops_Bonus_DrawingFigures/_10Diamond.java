package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _10Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int upper = (n + 1) / 2;

        for (int j = 0; j < n; j++) {
            System.out.print("\u001B[33m-");
        }
        System.out.println();

        for (int i = 1; i <= upper; i++) {
            int leftRight = upper - i;

            for (int j = 1; j <= leftRight; j++) {
                System.out.print("\u001B[33m-");
            }

            if (i == 1) {
                for (int j = 1; j <= n - leftRight * 2; j++) {
                    System.out.print("\u001B[36m*\033[0m");
                }
            } else {
                System.out.print("\u001B[36m*\033[0m");

                int mid = n - 2 * leftRight - 2;
                for (int j = 1; j <= mid; j++) {
                    System.out.print("\u001B[34m-");
                }

                System.out.print("\u001B[36m*\033[0m");
            }

            for (int j = 1; j <= leftRight; j++) {
                System.out.print("\u001B[30m-\033[0m");
            }

            System.out.println();
        }

        int lower = (n - 1) / 2;
        for (int i = lower - 1; i >= 0; i--) {
            int leftRight = lower - i;

            for (int j = 1; j <= leftRight; j++) {
                System.out.print("\u001B[33m-\033[0m");
            }

            if(i == 0) {
                for (int j = 1; j <= n - leftRight * 2; j++) {
                    System.out.print("\u001B[36m*\033[0m");
                }
            } else {
                System.out.print("\u001B[36m*\033[0m");

                int mid = n - 2 * leftRight - 2;
                for (int j = 1; j <= mid; j++) {
                    System.out.print("\u001B[34m-");
                }

                System.out.print("\u001B[36m*\033[0m");
            }

            for (int j = 1; j <= leftRight; j++) {
                System.out.print("\u001B[30m-\033[0m");
            }

            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            System.out.print("\u001B[33m-");
        }
        System.out.println();
    }
}