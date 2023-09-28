package _07ExamPreparation1;

import java.util.Scanner;

public class _03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drinkType = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinks = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if(drinkType.equals("Espresso")) {
            if(sugar.equals("Without")) {
                price = .9;
            } else if (sugar.equals("Normal")) {
                price = 1;
            } else if (sugar.equals("Extra")) {
                price = 1.2;
            }
        } else if(drinkType.equals("Cappuccino")) {
            if(sugar.equals("Without")) {
                price = 1;
            } else if (sugar.equals("Normal")) {
                price = 1.2;
            } else if (sugar.equals("Extra")) {
                price = 1.6;
            }
        } else if(drinkType.equals("Tea")) {
            if(sugar.equals("Without")) {
                price = .5;
            } else if (sugar.equals("Normal")) {
                price = .6;
            } else if (sugar.equals("Extra")) {
                price = .7;
            }
        }

        if(sugar.equals("Without")) {
            price *= .65;
        }

        if(drinkType.equals("Espresso") && drinks >= 5) {
            price *= .75;
        }

        double totalCost = price * drinks;
        if(totalCost > 15) {
            totalCost *= .8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", drinks, drinkType, totalCost);
    }
}