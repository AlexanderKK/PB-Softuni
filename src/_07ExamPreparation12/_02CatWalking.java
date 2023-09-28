package _07ExamPreparation12;

import java.util.Scanner;

public class _02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalkDaily = Integer.parseInt(scanner.nextLine());
        int walksDaily = Integer.parseInt(scanner.nextLine());
        int calorieIntakeDaily = Integer.parseInt(scanner.nextLine());

        double caloriesBurnedDaily = minutesWalkDaily * 5 * walksDaily;

        if(caloriesBurnedDaily >= calorieIntakeDaily / 2.0) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", caloriesBurnedDaily);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", caloriesBurnedDaily);
        }
    }
}