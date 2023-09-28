package _07ExamPreparation4;

import java.util.Scanner;

public class _05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());
        boolean isMore = false;
        double sumPrice = 0;
        for (int i = 1; i <= series; i++) {
            String title = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            if ("Thrones".equals(title)) {
                price *= .5;
            } else if ("Lucifer".equals(title)) {
                price *= .6;
            } else if ("Protector".equals(title)) {
                price *= .7;
            } else if ("TotalDrama".equals(title)) {
                price *= .8;
            } else if ("Area".equals(title)) {
                price *= .9;
            }

            sumPrice += price;
            if(sumPrice > budget) {
                isMore = true;
            }
        }

        double diff = Math.abs(sumPrice - budget);
        if(isMore) {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        } else {
            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        }
    }
}