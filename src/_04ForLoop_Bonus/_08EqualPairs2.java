package _04ForLoop_Bonus;

import java.util.Scanner;

public class _08EqualPairs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int nextSum = 0;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;
        boolean isEqual = false;

        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if(i % 2 != 0) {
                sum = num1 + num2;
            } else {
                nextSum = num1 + num2;
            }

            if(sum == nextSum || i == 1) {
                isEqual = true;
            } else {
                isEqual = false;

                diff = Math.abs(sum - nextSum);
                if(diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        if(isEqual) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}