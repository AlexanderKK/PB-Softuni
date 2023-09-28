package _07ExamPreparation12;

import java.util.Scanner;

public class _06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double sumAmount = 0;
        int sumWins = 0;
        int sumLosses = 0;

        for (int i = 1; i <= days; i++) {
            String command = scanner.nextLine();
            int dailyWins = 0;
            int dailyLosses = 0;
            double amount = 0;

            while(!command.equals("Finish")) {
                String sport = command;

                String result = scanner.nextLine();
                if(result.equals("win")) {
                    amount += 20;
                    dailyWins++;
                } else if(result.equals("lose")) {
                    dailyLosses++;
                }

                command = scanner.nextLine();
            }

            if(dailyWins > dailyLosses) {
                amount *= 1.1;
            }
            sumAmount += amount;

            sumWins += dailyWins;
            sumLosses += dailyLosses;
        }

        if(sumWins > sumLosses) {
            sumAmount *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", sumAmount);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumAmount);
        }
    }
}