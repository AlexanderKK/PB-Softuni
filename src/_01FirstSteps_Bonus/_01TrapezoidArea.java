package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _01TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = (b1 + b2) * h / 2;

        System.out.printf("%.2f", area);
    }
}