package _07ExamPreparation5;

import java.util.Scanner;

public class _03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        int cost = 0;
        if(destination.equals("Dubai")) {
            if(season.equals("Summer")) {
                cost = 40000;
            } else if(season.equals("Winter")) {
                cost = 45000;
            }
        } else if(destination.equals("Sofia")) {
            if(season.equals("Summer")) {
                cost = 12500;
            } else if(season.equals("Winter")) {
                cost = 17000;
            }
        } else if(destination.equals("London")) {
            if(season.equals("Summer")) {
                cost = 20250;
            } else if(season.equals("Winter")) {
                cost = 24000;
            }
        }
        double totalCost = cost * days;
        if(destination.equals("Dubai")) {
            totalCost *= .7;
        } else if(destination.equals("Sofia")) {
            totalCost *= 1.25;
        }

        double diff = budget - totalCost;
        if(budget >= totalCost) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(diff));
        }
    }
}