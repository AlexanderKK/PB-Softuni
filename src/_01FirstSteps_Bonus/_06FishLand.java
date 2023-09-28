package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _06FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceМackerelPerKg = Double.parseDouble(scanner.nextLine());
        double priceSpratPerKg = Double.parseDouble(scanner.nextLine());

        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        int clamKg = Integer.parseInt(scanner.nextLine());

        double priceBonitoPerKg = priceМackerelPerKg + priceМackerelPerKg * 0.6;
        double priceHorseMackerelPerKg = priceSpratPerKg * 1.8;
        double priceClamPerKg = 7.50;

        double finalPrice = bonitoKg * priceBonitoPerKg + horseMackerelKg * priceHorseMackerelPerKg + clamKg * priceClamPerKg;

        System.out.printf("%.2f", finalPrice);
    }
}