package _06NestedLoops_Bonus_MoreExercises;

import java.util.Scanner;

public class _11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysParked = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double total = 0;
        for (int day = 1; day <= daysParked; day++) {
            double amountForCurrentDay = 0;

            for (int hour = 1; hour <= hoursPerDay; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    amountForCurrentDay += 2.5;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    amountForCurrentDay += 1.25;
                } else {
                    amountForCurrentDay += 1;
                }
            }

            System.out.printf("Day: %d - %.2f leva%n", day, amountForCurrentDay);
            total += amountForCurrentDay;
        }

        System.out.printf("Total: %.2f leva", total);
    }
}