package _04ForLoop_Bonus;

import java.util.Scanner;

public class _05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int turns = Integer.parseInt(scanner.nextLine());

        double score = 0;

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;

        for (int i = 0; i < turns; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(number >= 0 && number <= 50) {
                if(number <= 9) {
                    score += number * .2;
                    sum1++;
                } else if(number <= 19) {
                    score += number * .3;
                    sum2++;
                } else if(number <= 29) {
                    score += number * .4;
                    sum3++;
                } else if(number <= 39) {
                    score += 50;
                    sum4++;
                } else {
                    score += 100;
                    sum5++;
                }
            } else {
                score /= 2;
                sum6++;
            }
        }

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", 1.0 * sum1 / turns * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", 1.0 * sum2 / turns * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", 1.0 * sum3 / turns * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", 1.0 * sum4 / turns * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", 1.0 * sum5 / turns * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", 1.0 * sum6 / turns * 100);
    }
}