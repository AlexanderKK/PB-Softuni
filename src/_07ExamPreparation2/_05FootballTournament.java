package _07ExamPreparation2;

import java.util.Scanner;

public class _05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int matches = Integer.parseInt(scanner.nextLine());
        if(matches <= 0) {
            System.out.println(team + " hasn't played any games during this season.");
        } else {
            int totalScore = 0;
            int sumW = 0;
            int sumD = 0;
            int sumL = 0;

            for (int i = 1; i <= matches; i++) {
                char aftermath = scanner.nextLine().charAt(0);

                if(aftermath == 'W') {
                    sumW++;
                    totalScore += 3;
                } else if(aftermath == 'D') {
                    sumD++;
                    totalScore ++;
                } else if(aftermath == 'L') {
                    sumL++;
                }
            }

            System.out.printf("%s has won %d points during this season.%n", team, totalScore);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", sumW);
            System.out.printf("## D: %d%n", sumD);
            System.out.printf("## L: %d%n", sumL);
            System.out.printf("Win rate: %.2f%%", sumW * 1.0 / matches * 100);
        }
    }
}