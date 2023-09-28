package _07ExamPreparation10;

import java.util.Scanner;

public class _01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPricePerKg = Double.parseDouble(scanner.nextLine());
        double flourKgs = Double.parseDouble(scanner.nextLine());
        double sugarKgs = Double.parseDouble(scanner.nextLine());
        int eggCrusts = Integer.parseInt(scanner.nextLine());
        int yeastPackets = Integer.parseInt(scanner.nextLine());

        double flourCost = flourPricePerKg * flourKgs;
        double sugarPricePerKg = flourPricePerKg * .75;
        double sugarCost = sugarKgs * sugarPricePerKg;
        double eggCrustsCost = eggCrusts * (flourPricePerKg * 1.1);
        double yeastPacketsCost = yeastPackets * (sugarPricePerKg * .2);

        double totalCost = flourCost + sugarCost +  eggCrustsCost + yeastPacketsCost;
        System.out.printf("%.2f", totalCost);
    }
}