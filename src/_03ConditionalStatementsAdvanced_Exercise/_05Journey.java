package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String destination = "";

        if(budget > 0 && budget <= 100) {
            if(season.equals("summer")) {
                price = budget * .3;
            } else if(season.equals("winter")) {
                price = budget * .7;
            }
            destination = "Bulgaria";
        }
        else if(budget <= 1000) {
            if(season.equals("summer")) {
                price = budget * .4;
            } else if(season.equals("winter")) {
                price = budget * .8;
            }
            destination = "Balkans";
        }
        else if(budget > 1000) {
            price = budget * .9;
            destination = "Europe";
        }

        String vacationType = "";
        if(season.equals("winter") || destination.equals("Europe")) {
            vacationType = "Hotel";
        } else if(season.equals("summer")) {
            vacationType = "Camp";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, price);
    }
}