package _07ExamPreparation13;

import java.util.Scanner;

public class _06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double sumTotalAmount = 0;
        int sumTotalWins = 0;
        int sumTotalLosses = 0;

        for (int i = 0; i < days; i++) {
            int dailyWins = 0;
            int dailyLosses = 0;
            double dailyAmount = 0;

            String command = scanner.nextLine();
            while(!command.equals("Finish")) {
                String sport = command;

                String result = scanner.nextLine();
                if(result.equals("win")) {
                    dailyAmount += 20;
                    dailyWins++;
                } else if(result.equals("lose")) {
                    dailyLosses++;
                }

                command = scanner.nextLine();
            }

            if(dailyWins > dailyLosses) {
                dailyAmount *= 1.1;
            }

            sumTotalWins += dailyWins;
            sumTotalLosses += dailyLosses;
            sumTotalAmount += dailyAmount;
        }

        if(sumTotalWins > sumTotalLosses) {
            sumTotalAmount *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", sumTotalAmount);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumTotalAmount);
        }
    }
}