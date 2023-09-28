package PersonalExercise;

import java.util.Scanner;

public class _03CalculatePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", calcPower(a, b));
    }

    static double calcPower(double number, double power) {
        double result = 1.0;
        for (int i = 1; i <= power; i++) {
            //a = 2 | b = 3 =>  1. 2 * 1 | 2. 2 * 2 | 3. 2 * 2 * 2
            result *= number;
        }
        return result;
    }
}