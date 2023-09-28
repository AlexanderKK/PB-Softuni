package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _07ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        for (int rows = 1; rows <= n; rows++) {
            for (int i = 1; i <= n - rows; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= rows; i++) {
                System.out.print("*");
            }
            System.out.print(" | ");

            for (int i = 1; i <= rows; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}