package _07ExamPreparation6;

import java.util.Scanner;

public class _02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litersNeeded = Double.parseDouble(scanner.nextLine());
        String weekday = scanner.nextLine();

        double cost = 100 + litersNeeded * 2.1;
        if(weekday.equals("Saturday")) {
            cost *= .9;
        } else if(weekday.equals("Sunday")) {
            cost *= .8;
        }

        double diff = budget - cost;
        if(diff >= 0) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(diff));
        }
    }
}