package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seriesDuration = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakInMinutes / 8.0;
        double restDuration = breakInMinutes / 4.0;

        double remainingTime = breakInMinutes - lunchDuration - restDuration;

        double diff = Math.abs(remainingTime - seriesDuration);

        if(remainingTime >= seriesDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(diff));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(diff));
        }
    }
}