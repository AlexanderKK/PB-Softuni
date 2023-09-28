package _07ExamPreparation7;

import java.util.Scanner;

public class _04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        String command = scanner.nextLine();
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        String winner = "";
        int winnerScore = 0;
        boolean numberWars = false;

        while (!command.equals("End of game")) {
            int card1 = Integer.parseInt(command);
            int card2 = Integer.parseInt(scanner.nextLine());

            if (card1 > card2) {
                scorePlayer1 += card1 - card2;
            } else if (card1 < card2) {
                scorePlayer2 += card2 - card1;
            } else {
                int newCard1;
                int newCard2;

                do {
                    newCard1 = Integer.parseInt(scanner.nextLine());
                    newCard2 = Integer.parseInt(scanner.nextLine());
                    if (newCard1 > newCard2) {
                        winner = player1;
                        winnerScore = scorePlayer1;
                        numberWars = true;
                    } else if (newCard1 < newCard2) {
                        winner = player2;
                        winnerScore = scorePlayer2;
                        numberWars = true;
                    }
                } while (newCard1 == newCard2);

                break;
            }

            command = scanner.nextLine();
        }

        if(numberWars) {
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", winner, winnerScore);
        } else {
            System.out.printf("%s has %d points%n", player1, scorePlayer1);
            System.out.printf("%s has %d points%n", player2, scorePlayer2);
        }
    }
}