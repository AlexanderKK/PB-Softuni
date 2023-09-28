package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlValue = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int password = 0;
        boolean hasPassword = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if(a * b + c * d == controlValue) {
                            if(a < b && c > d) {
                                counter++;
                                if(counter == 4) {
                                    String strPass = a + "" + b + "" + c + "" +d;
                                    password = Integer.parseInt(strPass);
                                    hasPassword = true;
                                }
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
        if(hasPassword) {
            System.out.print("Password: " + password);
        } else {
            System.out.print("No!");
        }
    }
}