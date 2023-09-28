package _07ExamPreparation1;

import java.util.Scanner;

public class _06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxScore = Integer.MIN_VALUE;
        String winner = "";

        while(!command.equals("Stop")) {
            String name = command;
            int score = 0;

            for (int i = 0; i < name.length(); i++) {
                int guess = Integer.parseInt(scanner.nextLine());
                int ASCIILetter = name.charAt(i);

                if(guess == ASCIILetter) {
                    score += 10;
                } else {
                    score += 2;
                }
            }

            if(score >= maxScore) {
                maxScore = score;
                winner = name;
            }

            command = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winner, maxScore);
    }
}