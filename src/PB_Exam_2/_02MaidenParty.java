package PB_Exam_2;

import java.util.Scanner;

public class _02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChains = Integer.parseInt(scanner.nextLine());
        int cartoons = Integer.parseInt(scanner.nextLine());
        int luckSurprises = Integer.parseInt(scanner.nextLine());

        double loveLettersPrice = loveLetters * .6;
        double waxRosesPrice = waxRoses * 7.2;
        double keyChainsPrice = keyChains * 3.6;
        double cartoonsPrice = cartoons * 18.2;
        double luckSurprisesPrice = luckSurprises * 22;

        double totalPrice = loveLettersPrice + waxRosesPrice + keyChainsPrice + cartoonsPrice + luckSurprisesPrice;
        double items = loveLetters + waxRoses + keyChains + cartoons + luckSurprises;
        if(items >= 25) {
            totalPrice *= .65;
        }

        totalPrice *= .9;

        if(totalPrice >= price) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - totalPrice);
        }
    }
}