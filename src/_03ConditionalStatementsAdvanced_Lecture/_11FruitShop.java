package _03ConditionalStatementsAdvanced_Lecture;

import java.util.Scanner;

public class _11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isWeekday = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                            day.equals("Thursday") || day.equals("Friday");
        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");

        boolean isInvalid = false;

        double price = 0;

        if(isWeekday) {
            if ("banana".equals(fruit)) {
                price = 2.50;
            } else if ("apple".equals(fruit)) {
                price = 1.20;
            } else if ("orange".equals(fruit)) {
                price = 0.85;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.45;
            } else if ("kiwi".equals(fruit)) {
                price = 2.70;
            } else if ("pineapple".equals(fruit)) {
                price = 5.50;
            } else if ("grapes".equals(fruit)) {
                price = 3.85;
            } else {
                isInvalid = true;
            }
        }
        else if(isWeekend) {
            if ("banana".equals(fruit)) {
                price = 2.70;
            } else if ("apple".equals(fruit)) {
                price = 1.25;
            } else if ("orange".equals(fruit)) {
                price = 0.90;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.60;
            } else if ("kiwi".equals(fruit)) {
                price = 3.00;
            } else if ("pineapple".equals(fruit)) {
                price = 5.60;
            } else if ("grapes".equals(fruit)) {
                price = 4.20;
            } else {
                isInvalid = true;
            }
        }
        else {
            isInvalid = true;
        }

        if(isInvalid) {
            System.out.println("error");
        }
        else {
            double total = price * quantity;
            System.out.printf("%.2f", total);
        }
    }
}