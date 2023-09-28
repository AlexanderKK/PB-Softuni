package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        int graphicsPrice = graphicsCount * 250;
        double processorsPrice = processorsCount * graphicsPrice * .35;
        double ramPrice = ramCount * graphicsPrice * .1;

        double total = graphicsPrice + processorsPrice + ramPrice;

        if(graphicsCount > processorsCount) {
            total -= total * .15;
        }

        if(budget >= total) {
            System.out.printf("You have %.2f leva left!", budget - total);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}