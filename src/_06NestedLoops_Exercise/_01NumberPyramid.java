package _06NestedLoops_Exercise;

import java.util.Scanner;

public class _01NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        boolean hasEnded = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                if(number > n) {
                    hasEnded = true;
                    break;
                }

                System.out.print(number + " ");
                number++;
            }

            if(hasEnded) {
                break;
            }
            System.out.println();
        }
    }
}