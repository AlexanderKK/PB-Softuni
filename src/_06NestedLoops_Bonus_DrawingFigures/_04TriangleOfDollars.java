package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _04TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}