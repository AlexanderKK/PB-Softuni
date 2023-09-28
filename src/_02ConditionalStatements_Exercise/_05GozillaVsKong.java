package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _05GozillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statisticians = Integer.parseInt(scanner.nextLine());
        double clothingPerStatistician = Double.parseDouble(scanner.nextLine());

        double decor = budget * .1;

        if(statisticians > 150) {
            clothingPerStatistician -= clothingPerStatistician / 10;
        }

        double priceClothing = clothingPerStatistician * statisticians;
        double totalPrice = decor + priceClothing;

        if(totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice - budget);
        }
        else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalPrice);
        }
    }
}