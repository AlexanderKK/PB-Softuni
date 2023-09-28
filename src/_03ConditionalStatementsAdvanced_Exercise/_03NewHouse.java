package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if(flowers.equals("Roses")) {
            price = quantity * 5;

            if(quantity > 80) {
                price -= price * .1;
            }
        } else if(flowers.equals("Dahlias")) {
            price = quantity * 3.80;

            if(quantity > 90) {
                price -= price * .15;
            }
        } else if(flowers.equals("Tulips")) {
            price = quantity * 2.80;

            if(quantity > 80) {
                price -= price * .15;
            }
        } else if(flowers.equals("Narcissus")) {
            price = quantity * 3;

            if(quantity < 120) {
                price += price * .15;
            }
        } else if(flowers.equals("Gladiolus")) {
            price = quantity * 2.50;

            if(quantity < 80) {
                price += price * .2;
            }
        }

        double result = 0;
        if(budget >= price) {
            result = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, result);
        } else {
            result = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", result);
        }
    }
}