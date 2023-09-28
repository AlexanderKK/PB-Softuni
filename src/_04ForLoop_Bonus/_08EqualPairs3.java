package _04ForLoop_Bonus;

import java.util.Scanner;

public class _08EqualPairs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int prevSum = 0;
        int maxDiff = Integer.MIN_VALUE;
        boolean isNotEqual = false;

        for (int i = 1; i <= n * 2; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sum += number;
            if(i % 2 == 0) {
                if(sum != prevSum && i != 2) {
                    isNotEqual = true;

                    int diff = Math.abs(sum - prevSum);
                    if(diff > maxDiff) {
                        maxDiff = diff;
                    }
                }
                prevSum = sum;
                sum = 0;
            }
        }

        if(isNotEqual) {
            System.out.printf("No, maxdiff=%d", maxDiff);
        } else {
            System.out.printf("Yes, value=%d", prevSum);
        }
    }
}