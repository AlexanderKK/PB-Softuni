package _04ForLoop_Bonus;

import java.util.Scanner;

public class _11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if(i % 2 != 0) {
                oddSum += number;

                if(number < oddMin) {
                    oddMin = number;
                }
                if(number > oddMax) {
                    oddMax = number;
                }
            } else {
                evenSum += number;

                if(number < evenMin) {
                    evenMin = number;
                }
                if(number > evenMax) {
                    evenMax = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);

        if(oddMin != Integer.MAX_VALUE) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        } else {
            System.out.println("OddMin=No,");
        }

        if(oddMax != Integer.MIN_VALUE) {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.println("OddMax=No,");
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);

        if(evenMin != Integer.MAX_VALUE) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        } else {
            System.out.println("EvenMin=No,");
        }

        if(evenMax != Integer.MIN_VALUE) {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        } else {
            System.out.println("EvenMax=No");
        }
    }
}