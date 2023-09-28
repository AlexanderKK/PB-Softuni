package PersonalExercise;

import java.util.Scanner;

public class _03Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        number = scanner.nextInt();
        int otherNumber;
        otherNumber = scanner.nextInt();

//        int sum = number + otherNumber;

        if(number < otherNumber) {
            System.out.println("first is smaller");
        }
    }
}