package PB_Exam;

import java.util.Scanner;

public class _02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costParty = Double.parseDouble(scanner.nextLine());
        int loveCards = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int cartoons = Integer.parseInt(scanner.nextLine());
        int luckSurprises = Integer.parseInt(scanner.nextLine());

        double priceLoveCards = 0.6 * loveCards;
        double priceWaxRoses = 7.2 * waxRoses;
        double priceKeychains = 3.6 * keychains;
        double priceCartoons = 18.2 * cartoons;
        double priceLuckSurprises = 22 * luckSurprises;

        double profit = priceLoveCards + priceWaxRoses + priceKeychains + priceCartoons + priceLuckSurprises;
        int sumArticles = loveCards + waxRoses + keychains + cartoons + luckSurprises;

        if(sumArticles >= 25) {
            profit *= .65;
        }
        profit *= .9;

        double diff = profit - costParty;
        if(diff >= 0) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(diff));
        }
    }
}