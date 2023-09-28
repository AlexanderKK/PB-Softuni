package _07ExamPreparation11;

import java.util.Scanner;

public class _05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxGoals = 0;
        String bestPlayer = "";

        while(!command.equals("END")) {
            String playerName = command;
            int goals = Integer.parseInt(scanner.nextLine());

            if(goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = playerName;
            }

            if(goals >= 10) {
                break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if(maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}