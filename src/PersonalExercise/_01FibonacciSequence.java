package PersonalExercise;

import java.util.Scanner;

public class _01FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long firstNum = 0;
        long secondNum = 1;

        for (int i = 0; i <= n; i++) {
            if(i == 0) {
                System.out.print(0 + " ");
            } else if(i == 1) {
                System.out.print(1 + " ");
            } else {
                long temp = firstNum + secondNum;
                System.out.print(temp + " ");

                firstNum = secondNum;
                secondNum = temp;
            }
        }
    }
}