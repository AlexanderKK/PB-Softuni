package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapesKgPerSqM = Double.parseDouble(scanner.nextLine());
        int requiredLitersWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapesKg = area * grapesKgPerSqM;
        double litersWine = (grapesKg * 0.4) / 2.5;

        if(litersWine < requiredLitersWine) {
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int)Math.floor(requiredLitersWine - litersWine));
        }
        else {
            System.out.printf("Good harvest this year! Total wine: %d liters.%n", (int)Math.floor(litersWine));

            double wineLeft = Math.ceil(litersWine - requiredLitersWine);
            double winePerWorker = Math.ceil(wineLeft / workers);

            System.out.printf("%d liters left -> %d liters per person.", (int)wineLeft, (int)winePerWorker);
        }
    }
}