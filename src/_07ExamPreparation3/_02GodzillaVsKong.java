package _07ExamPreparation3;

import java.util.Scanner;

public class _02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double pricePerOutfit = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double priceOutfits = statists * pricePerOutfit;
        if(statists > 150) {
            priceOutfits *= 0.90;
        }

        double total = decor + priceOutfits;
        if(total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }
    }
}