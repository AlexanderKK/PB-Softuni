package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            if(rows == 1 || rows == n) {
                System.out.print("+ ");
                for (int cols = 1; cols <= n - 2; cols++) {
                    System.out.print("- ");
                }
                System.out.print("+");

                System.out.println();
            } else {
                System.out.print("| ");
                for (int cols = 1; cols <= n - 2; cols++) {
                    System.out.print("- ");
                }
                System.out.print("|");

                System.out.println();
            }
        }
    }
}