package _07ExamPreparation12;

import java.util.Scanner;

public class _04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double amountFood = Double.parseDouble(scanner.nextLine());

        double cookies = 0;
        int sumFoodQty = 0;
        int sumCatFood = 0;
        int sumDogFood = 0;

        for (int i = 1; i <= days; i++) {
            int dogFoodConsumed = Integer.parseInt(scanner.nextLine());
            int catFoodConsumed = Integer.parseInt(scanner.nextLine());

            int sumDaily = catFoodConsumed + dogFoodConsumed;
            sumFoodQty += sumDaily;
            sumCatFood += catFoodConsumed;
            sumDogFood += dogFoodConsumed;

            if(i % 3 == 0) {
                cookies += sumDaily * .1;
            }
        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", Math.floor(cookies));
        System.out.printf("%.2f%% of the food has been eaten.%n", sumFoodQty / amountFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", sumDogFood * 1.0 / sumFoodQty * 100);
        System.out.printf("%.2f%% eaten from the cat.", sumCatFood * 1.0 / sumFoodQty * 100);
    }
}