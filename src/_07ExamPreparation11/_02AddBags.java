package _07ExamPreparation11;

import java.util.Scanner;

public class _02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForLuggageOver20Kgs = Double.parseDouble(scanner.nextLine());
        double luggageKgs = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        double price;
        if(luggageKgs < 10) {
            price = priceForLuggageOver20Kgs * .2;
        } else if(luggageKgs <= 20) {
            price = priceForLuggageOver20Kgs * .5;
        } else {
            price = priceForLuggageOver20Kgs;
        }

        if(days > 30) {
            price *= 1.1;
        } else if(days >= 7) {
            price *= 1.15;
        } else {
            price *= 1.4;
        }
        double total = price * luggageCount;
        System.out.printf("The total price of bags is: %.2f lv.", total);
    }
}