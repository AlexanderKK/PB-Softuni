package PersonalExercise;

import java.util.Scanner;

public class _07ItIsChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tree leaves height: ");
        int leaves = Integer.parseInt(scanner.nextLine());

        System.out.println();

        if(leaves > 2) {

            for (int cols = 1; cols <= leaves - 1; cols++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

            for (int rows = 1; rows <= leaves - 1; rows++) {
                for (int cols = 1; cols <= leaves - 1 - rows; cols++) {
                    System.out.print(" ");
                }

                for (int cols = 1; cols <= rows; cols++) {
                    System.out.print("*");
                }

                System.out.print("*");

                for (int cols = 1; cols <= rows; cols++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int rows = 1; rows <= 2; rows++) {
                for (int cols = 1; cols <= leaves - 1; cols++) {
                    if (rows == 1 && cols == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("|");
                if (rows == 1) {
                    for (int cols = 1; cols <= leaves - 2; cols++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}