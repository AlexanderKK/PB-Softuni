package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _10MultiplyBy2 {
    static Scanner scanner = new Scanner(System.in);

    public void MultiplyBy2() {
        double num = 0;

        do {
            num = Double.parseDouble(scanner.nextLine());

            if(num >= 0) {
                System.out.printf("Result: %.2f%n", num * 2);
            } else {
                System.out.println("Negative number!");
            }
        } while(num >= 0);
    }

    public static void main(String[] args) {
        new _10MultiplyBy2().MultiplyBy2();
    }
}