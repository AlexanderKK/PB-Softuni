package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation = "";
        String location = "";
        double price = 0;

        if(budget <= 1000) {
            accommodation = "Camp";
            if(season.equals("Summer")) {
                location = "Alaska";
                price = budget * .65;
            } else if(season.equals("Winter")) {
                location = "Morocco";
                price = budget * .45;
            }
        } else if(budget <= 3000) {
            accommodation = "Hut";
            if(season.equals("Summer")) {
                location = "Alaska";
                price = budget * .8;
            } else if(season.equals("Winter")) {
                location = "Morocco";
                price = budget * .6;
            }
        } else {
            accommodation = "Hotel";
            if(season.equals("Summer")) {
                location = "Alaska";
            } else if(season.equals("Winter")) {
                location = "Morocco";
            }
            price = budget * .9;
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}