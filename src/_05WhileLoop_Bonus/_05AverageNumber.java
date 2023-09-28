package _05WhileLoop_Bonus;

import java.util.Scanner;

public class _05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        double average = sum / (n * 1.0);

        System.out.printf("%.2f", average);
    }
}