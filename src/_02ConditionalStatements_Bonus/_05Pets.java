package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _05Pets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayGram = Double.parseDouble(scanner.nextLine());

        double dogFood = dogFoodPerDayKg * days;
        double catFood = catFoodPerDayKg * days;
        double turtleFood = turtleFoodPerDayGram / 1000.0 * days ;

        double foodNeeded = dogFood + catFood + turtleFood;

        int result = 0;

        if(foodLeft >= foodNeeded) {
            result = (int)Math.floor(foodLeft - foodNeeded);
            System.out.println(result + " kilos of food left.");
        }
        else {
            result = (int)Math.ceil(foodNeeded - foodLeft);
            System.out.println(result + " more kilos of food are needed.");
        }
    }
}