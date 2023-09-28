package _07ExamPreparation12;

import java.util.Scanner;

public class _05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountFoodKgs = Integer.parseInt(scanner.nextLine());
        int sumFoodConsumedGrams = 0;

        String command = scanner.nextLine();
        while(!command.equals("Adopted")) {
            int foodConsumedGrams = Integer.parseInt(command);
            sumFoodConsumedGrams += foodConsumedGrams;

            command = scanner.nextLine();
        }

        int amountFoodGrams = amountFoodKgs * 1000;
        int diff = amountFoodGrams - sumFoodConsumedGrams;

        if(diff >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(diff));
        }
    }
}