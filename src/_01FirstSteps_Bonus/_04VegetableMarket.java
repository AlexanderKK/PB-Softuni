package _01FirstSteps_Bonus;

import java.util.Scanner;

public class _04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKgVegs = Double.parseDouble(scanner.nextLine());
        double pricePerKgFruits = Double.parseDouble(scanner.nextLine());
        int overallKgVegs = Integer.parseInt(scanner.nextLine());
        int overallKgFruits = Integer.parseInt(scanner.nextLine());

        double finalPriceBGN = pricePerKgVegs * overallKgVegs + pricePerKgFruits * overallKgFruits;
        double finalPriceEUR = finalPriceBGN / 1.94;

        System.out.printf("%.2f", finalPriceEUR);
    }
}