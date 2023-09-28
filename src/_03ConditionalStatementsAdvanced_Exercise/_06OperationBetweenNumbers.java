package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _06OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        if(operator.equals("+")) {
            result = num1 + num2;
        } else if(operator.equals("-")) {
            result = num1 - num2;
        } else if(operator.equals("*")) {
            result = num1 * num2;
        } else if(operator.equals("/")) {
            if(num2 != 0) {
                result = (double)num1 / num2;
                System.out.printf("%d / %d = %.2f", num1, num2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        } else if(operator.equals("%")) {
            if(num2 != 0) {
                result = num1 % num2;
                System.out.printf("%d %% %d = %.0f", num1, num2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        }

        boolean isEvenOdd = operator.equals("+") || operator.equals("-") || operator.equals("*");
        String extra = "";

        if(isEvenOdd) {
            if(result % 2 == 0) {
                extra = "even";
            } else {
                extra = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, extra);
        }
    }
}