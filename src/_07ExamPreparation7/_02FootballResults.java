package _07ExamPreparation7;

import java.util.Scanner;

public class _02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstResult = scanner.nextLine();
        String secondResult = scanner.nextLine();
        String thirdResult = scanner.nextLine();

        int wins = 0;
        int draws = 0;
        int losses = 0;

        if(firstResult.charAt(0) > firstResult.charAt(2)) {
            wins++;
        } else if(firstResult.charAt(0) == firstResult.charAt(2)) {
            draws++;
        } else {
            losses++;
        }

        if(secondResult.charAt(0) > secondResult.charAt(2)) {
            wins++;
        } else if(secondResult.charAt(0) == secondResult.charAt(2)) {
            draws++;
        } else {
            losses++;
        }

        if(thirdResult.charAt(0) > thirdResult.charAt(2)) {
            wins++;
        } else if(thirdResult.charAt(0) == thirdResult.charAt(2)) {
            draws++;
        } else {
            losses++;
        }

        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.printf("Drawn games: %d", draws);
    }
}