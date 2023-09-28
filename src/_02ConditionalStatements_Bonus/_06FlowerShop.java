package _02ConditionalStatements_Bonus;

import java.util.Scanner;

public class _06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой магнолии – цяло число в интервала [0 … 50]
        //•	Брой зюмбюли – цяло число в интервала [0 … 50]
        //•	Брой рози – цяло число в интервала [0 … 50]
        //•	Брой кактуси – цяло число в интервала [0 … 50]
        //•	Цена на подаръка – реално число в интервала [0.00 … 500.00]

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = magnolias * 3.25;
        int hyacinthsPrice = hyacinths * 4;
        double rosesPrice = roses * 3.50;
        int cactiPrice = cacti * 8;

        double grossProfit = magnoliasPrice + hyacinthsPrice + rosesPrice + cactiPrice;
        double taxes = grossProfit * .05;
        double profit = grossProfit - taxes;

        double result = 0;
        if(profit >= giftPrice) {
            result = Math.floor(profit - giftPrice);
            System.out.printf("She is left with %.0f leva.", result);
        }
        else {
            result = Math.ceil(giftPrice - profit);
            System.out.printf("She will have to borrow %.0f leva.", result);
        }
    }
}