package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = celsius * 9.00 / 5 + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}