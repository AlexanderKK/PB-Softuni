package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int i = 1; i <= n - rows; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i <= rows - 1; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int rows = n - 1; rows >= 1; rows--) {
            for (int i = 1; i <= n - rows; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i < rows; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}