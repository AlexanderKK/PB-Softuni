package _04ForLoop_Exercise;

import java.util.Scanner;

public class _02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        if(limit != 0) {
            for (int i = 0; i < limit; i++) {
                int number = Integer.parseInt(scanner.nextLine());

                if(number > max) {
                    max = number;
                }
                sum += number;
            }

            //Sum of rest (numbers without max)
            sum -= max;

            if(sum == max) {
                System.out.println("Yes");
                System.out.printf("Sum = %d", max);
            } else {
                System.out.println("No");
                //Diff between {Sum of rest} and {max number}
                System.out.printf("Diff = %d", Math.abs(sum - max));
            }
        }
    }
}