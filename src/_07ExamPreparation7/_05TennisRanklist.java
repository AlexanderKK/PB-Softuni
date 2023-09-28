package _07ExamPreparation7;

import java.util.Scanner;

public class _05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialScore = Integer.parseInt(scanner.nextLine());

        int score = 0;
        int wins = 0;

        // FIXME: 10/13/2022
        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();

            if(stage.equals("W")) {
                score += 2000;
                wins++;
            } else if(stage.equals("F")) {
                score += 1200;
            } else if(stage.equals("SF")) {
                score += 720;
            }
        }

        System.out.printf("Final points: %d%n", initialScore + score);
        System.out.printf("Average points: %.0f%n", Math.floor(score * 1.0 / tournaments));
        System.out.printf("%.2f%%", wins * 1.0 / tournaments * 100);
    }
}