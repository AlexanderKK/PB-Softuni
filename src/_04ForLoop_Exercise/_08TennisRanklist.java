package _04ForLoop_Exercise;

import java.util.Scanner;

public class _08TennisRanklist{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialScore = Integer.parseInt(scanner.nextLine());

        int score = initialScore;
        int winCount = 0;

        for(int i = 0; i < tournaments; i++) {
            String result = scanner.nextLine();

            if(result.equals("W")) {
                score += 2000;
                winCount++;
            } else if(result.equals("F")) {
                score += 1200;
            } else if(result.equals("SF")) {
                score += 720;
            }
        }

        double averageScore = Math.floor((score - initialScore) * 1.0 / tournaments);

        double winPercentage = (winCount * 1.0 / tournaments) * 100;

        System.out.printf("Final points: %d%n", score);
        System.out.printf("Average points: %.0f%n", averageScore);
        System.out.printf("%.2f%%", winPercentage);
    }
}