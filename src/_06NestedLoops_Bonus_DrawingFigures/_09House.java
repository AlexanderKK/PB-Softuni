package _06NestedLoops_Bonus_DrawingFigures;

import java.util.Scanner;

public class _09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int roof = (n + 1) / 2;
        for (int row = 1; row <= roof; row++) {
            int leftRight = roof - row;
            for (int i = 1; i <= leftRight; i++) {
                System.out.print("-");
            }

            int stars = n - 2 * leftRight;
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }

            for (int i = 1; i <= leftRight; i++) {
                System.out.print("-");
            }
            System.out.println();
        }

        int basis = n / 2;
        for (int i = 1; i <= basis; i++) {
            System.out.print("|");

            for (int j = 1; j <= n - 2; j++) {
                System.out.print("*");
            }

            System.out.print("|");
            System.out.println();
        }
//
//        int roof = (n + 1) / 2;
//        for (int rows = 1; rows <= roof; rows++) {
//            int counter = 0;
//
//            for (int i = 1; i <= roof - rows; i++) {
//                System.out.print("-");
//                counter++;
//            }
//            if(n % 2 != 0 && rows == 1) {
//                System.out.print("*");
//            } else if(n % 2 == 0 && rows == 1) {
//                System.out.print("**");
//            } else {
//                for (int i = 1; i <= n - counter * 2 ; i++) {
//                    System.out.print("*");
//                }
//            }
//            for (int i = 1; i <= roof - rows; i++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }
//
//        int basis = n / 2;
//        for (int i = 1; i <= basis; i++) {
//            System.out.print("|");
//
//            for (int j = 1; j <= n - 2; j++) {
//                System.out.print("*");
//            }
//
//            System.out.print("|");
//
//            System.out.println();
//        }
    }
}