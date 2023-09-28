package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        int rent = 0;
        double price = 0;

        if(season.equals("Spring")) {
            rent = 3000;
        } else if(season.equals("Summer") || season.equals("Autumn")) {
            rent = 4200;
        } else if(season.equals("Winter")) {
            rent = 2600;
        }

        if(fishermen > 0 && fishermen <= 6) {
            price = rent - rent * .1;
        }
        else if(fishermen >= 7 && fishermen <= 11) {
            price = rent - rent * .15;
        }
        else if(fishermen >= 12) {
            price = rent - rent * .25;
        }

        if(fishermen % 2 == 0 && !season.equals("Autumn")) {
            price -= price * .05;
        }

        double result = 0;

        if(budget >= price) {
            result = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", result);
        }
        else {
            result = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", result);
        }
    }
}