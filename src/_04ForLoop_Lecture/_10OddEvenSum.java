package _04ForLoop_Lecture;

import java.util.Scanner;

public class _10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < limit; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        if(sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumOdd);
        } else {
            int diff = Math.abs(sumEven - sumOdd);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}