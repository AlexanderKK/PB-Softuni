package _07ExamPreparation13;

import java.util.Scanner;

public class _03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;
        if(gender == 'm') {
            if(sport.equals("Gym")) {
                cardPrice = 42;
            } else if(sport.equals("Boxing")) {
                cardPrice = 41;
            } else if(sport.equals("Yoga")) {
                cardPrice = 45;
            } else if(sport.equals("Zumba")) {
                cardPrice = 34;
            } else if(sport.equals("Dances")) {
                cardPrice = 51;
            } else if(sport.equals("Pilates")) {
                cardPrice = 39;
            }
        } else if(gender == 'f') {
            if(sport.equals("Gym")) {
                cardPrice = 35;
            } else if(sport.equals("Boxing")) {
                cardPrice = 37;
            } else if(sport.equals("Yoga")) {
                cardPrice = 42;
            } else if(sport.equals("Zumba")) {
                cardPrice = 31;
            } else if(sport.equals("Dances")) {
                cardPrice = 53;
            } else if(sport.equals("Pilates")) {
                cardPrice = 37;
            }
        }

        if(age <= 19) {
            cardPrice *= 0.8;
        }
        double diff = budget - cardPrice;
        if(diff >= 0) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(diff));
        }
    }
}