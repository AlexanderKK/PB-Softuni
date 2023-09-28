package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

//        System.out.println(Math.round((241.0 / 365 * 100) * 100.0) / 100.0);

        int timeForPlaying = (365 - daysOff) * 63 + daysOff * 127;

        int diff = 30000 - timeForPlaying;

        int hours = Math.abs(diff / 60);
        int minutes = Math.abs(diff % 60);

        if(diff < 0) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
        else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}