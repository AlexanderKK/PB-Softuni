package _07ExamPreparation1;

import java.util.Scanner;

public class _04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profitGoal = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double profit = 0;
        boolean goalAccomplished = false;

        while(!input.equals("Party!")) {
            String cocktail = input;
            int cocktailsQty = Integer.parseInt(scanner.nextLine());

            int cocktailPrice = cocktail.length();
            double currentCost = cocktailPrice * cocktailsQty;
            if(currentCost % 2 == 1) {
                currentCost *= .75;
            }
            profit += currentCost;
            if(profit >= profitGoal) {
                goalAccomplished = true;
                break;
            }

            input = scanner.nextLine();
        }

        if(goalAccomplished) {
            System.out.println("Target acquired.");
        } else {
            double moneyLeft = profitGoal - profit;
            System.out.printf("We need %.2f leva more.%n", moneyLeft);
        }
        System.out.printf("Club income - %.2f leva.", profit);
    }
}