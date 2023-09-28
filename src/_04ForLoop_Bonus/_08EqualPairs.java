package _04ForLoop_Bonus;

import java.util.Scanner;

public class _08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int prevSum = 0;
        boolean isEqual = true;

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n * 2; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sum += number;
            if(i % 2 == 0) {
                if(sum != prevSum && i > 2) {
                    isEqual = false;

                    int diff = Math.abs(sum - prevSum);
                    if(diff > max) {
                        max = diff;
                    }
                }

                prevSum = sum;
                sum = 0;
            }
        }

        if(isEqual) {
            System.out.println("Yes, value=" + prevSum);
        } else {
            System.out.println("No, maxdiff=" + max);
        }
    }
}