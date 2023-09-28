package PersonalExercise;

import java.util.Scanner;

public class _05TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d %d %d ", firstNumber, secondNumber, thirdNumber);
        for (int i = 0; i < n - 3; i++) {
            int nextNumber = firstNumber + secondNumber + thirdNumber;

            System.out.printf("%d ", nextNumber);

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = nextNumber;
        }
    }
}