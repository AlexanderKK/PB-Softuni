package _07ExamPreparation6;

import java.util.Scanner;

public class _05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numsBy2 = 0;
        int numsBy3 = 0;
        int numsBy4 = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(number % 2 == 0) {
                numsBy2++;
            }
            if(number % 3 == 0) {
                numsBy3++;
            }
            if(number % 4 == 0) {
                numsBy4++;
            }
        }

        System.out.printf("%.2f%%%n", numsBy2 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", numsBy3 * 1.0 / n * 100);
        System.out.printf("%.2f%%", numsBy4 * 1.0 / n * 100);
    }
}