package PersonalExercise;

import java.util.Scanner;

public class _06NacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int nextNumber = 0;
        String NacciSequence = number1 + " " + number2 + " ";

        for (int i = 1; i <= n - 2; i++) {
            if(i == 1) {
                nextNumber = number1 + number2;
            } else {
                nextNumber += nextNumber;
            }
            //1 2 3 6 12 24
            NacciSequence += nextNumber + " ";
        }
        System.out.printf("%s", NacciSequence.trim());
    }
}