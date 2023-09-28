package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmsPerMonth = Double.parseDouble(scanner.nextLine());
        double income = 0;

        boolean isAnySeason = false;
        if(season.equals("Spring") || season.equals("Autumn")) {
            if(kmsPerMonth <= 5000) {
                income = kmsPerMonth * .75;
            } else if(kmsPerMonth <= 10000) {
                income = kmsPerMonth * .95;
            } else if(kmsPerMonth <= 20000) {
                isAnySeason = true;
            }
        } else if(season.equals("Summer")) {
            if(kmsPerMonth <= 5000) {
                income = kmsPerMonth * .9;
            } else if(kmsPerMonth <= 10000) {
                income = kmsPerMonth * 1.1;
            } else if(kmsPerMonth <= 20000) {
                isAnySeason = true;
            }
        } else if(season.equals("Winter")) {
            if(kmsPerMonth <= 5000) {
                income = kmsPerMonth * 1.05;
            } else if(kmsPerMonth <= 10000) {
                income = kmsPerMonth * 1.25;
            } else if(kmsPerMonth <= 20000) {
                isAnySeason = true;
            }
        }

        if(isAnySeason) {
            income = kmsPerMonth * 1.45;
        }
        income *= 4;

        double salary = income - income * .1;

        System.out.printf("%.2f", salary);
    }
}