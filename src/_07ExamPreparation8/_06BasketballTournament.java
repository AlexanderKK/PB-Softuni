package _07ExamPreparation8;

import java.util.Scanner;

public class _06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumMatchesWon = 0;
        int sumMatchesLost = 0;
        int sumMatches = 0;

        while(!command.equals("End of tournaments")) {
            String tournament = command;
            int matches = Integer.parseInt(scanner.nextLine());
            for (int match = 1; match <= matches; match++) {
                int desiTeamScore = Integer.parseInt(scanner.nextLine());
                int foeScore = Integer.parseInt(scanner.nextLine());

                int diff = desiTeamScore - foeScore;
                if(diff > 0) {
                    sumMatchesWon++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", match, tournament, diff);
                } else if(diff < 0) {
                    sumMatchesLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", match, tournament, Math.abs(diff));
                }
                sumMatches++;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n", sumMatchesWon * 1.0 / sumMatches * 100);
        System.out.printf("%.2f%% matches lost", sumMatchesLost * 1.0 / sumMatches * 100);
    }
}