package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;

        if(season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumsPrice = chrysanthemums * 2;
            rosesPrice = roses * 4.1;
            tulipsPrice = tulips * 2.5;
        } else if(season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumsPrice = chrysanthemums * 3.75;
            rosesPrice = roses * 4.5;
            tulipsPrice = tulips * 4.15;
        }
        double flowersPrice = chrysanthemumsPrice + rosesPrice + tulipsPrice;

        if(holiday.equals("Y")) {
            flowersPrice += flowersPrice * .15;
        }

        int flowersCount = chrysanthemums + roses + tulips;

        if(season.equals("Spring") && tulips > 7) {
            flowersPrice -= flowersPrice * .05;
        }
        if(season.equals("Winter") && roses >= 10) {
            flowersPrice -= flowersPrice * .1;
        }
        if(flowersCount > 20) {
            flowersPrice -= flowersPrice * .2;
        }

        double income = flowersPrice + 2;
        System.out.printf("%.2f", income);
    }
}