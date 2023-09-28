package _07ExamPreparation8;

import java.util.Scanner;

public class _04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        String command = scanner.nextLine();

        int score = 301;
        int failedShots = 0;
        int successfulShots = 0;
        boolean hasWon = false;

        while(!command.equals("Retire")) {
            String sector = command;
            int points = Integer.parseInt(scanner.nextLine());
            if(sector.equals("Double")) {
                points *= 2;
            } else if(sector.equals("Triple")) {
                points *= 3;
            }

            int temp = score;

            score -= points;
            if(score > 0) {
                successfulShots++;
            } else if(score < 0) {
                score = temp;
                failedShots++;
            } else {
                successfulShots++;
                hasWon = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(hasWon) {
            System.out.printf("%s won the leg with %d shots.", player, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, failedShots);
        }
    }
}