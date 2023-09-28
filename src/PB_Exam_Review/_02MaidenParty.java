package PB_Exam_Review;

import java.util.Scanner;

public class _02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyCost = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChains = Integer.parseInt(scanner.nextLine());
        int cartoons = Integer.parseInt(scanner.nextLine());
        int luckSurprises = Integer.parseInt(scanner.nextLine());

        double loveLettersCost = loveLetters * .6;
        double waxRosesCost = waxRoses * 7.2;
        double keyChainsCost = keyChains * 3.6;
        double cartoonsCost = cartoons * 18.2;
        double luckSurprisesCost = luckSurprises * 22;

        int purchases = loveLetters + waxRoses + keyChains + cartoons + luckSurprises;
        double income = loveLettersCost + waxRosesCost + keyChainsCost + cartoonsCost + luckSurprisesCost;
        if(purchases > 25) {
            income *= .65;
        }
        income *= .9;

        if(income >= partyCost) {
            System.out.printf("Yes! %.2f lv left.", income - partyCost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyCost - income);
        }
    }
}