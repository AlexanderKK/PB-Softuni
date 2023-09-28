package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= n * 2 - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            for (int k = 1; k <= n; k++) {
                if(i == (n - 1) / 2) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("*");
            for (int j = 1; j <= n * 2 - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print("*");
        }
    }
}