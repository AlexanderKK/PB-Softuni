package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        if(category.equals("VIP")) {
            ticketPrice = 499.99;
        }
        else if(category.equals("Normal")) {
            ticketPrice = 249.99;
        }
        ticketPrice *= people;

        if(people >= 1 && people <= 4) {
            budget -= budget * .75;
        } else if(people <= 9) {
            budget -= budget * .6;
        } else if(people <= 24) {
            budget -= budget * .5;
        } else if(people <= 49) {
            budget -= budget * .4;
        } else {
            budget -= budget * .25;
        }

        double diff = budget - ticketPrice;
        if(diff >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diff));
        }
    }
}