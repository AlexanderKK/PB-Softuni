package _02ConditionalStatements_Exercise;

import java.util.Scanner;

public class _04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzlesCount * 2.60;
        int dollsPrice = dollsCount * 3;
        double teddyBearsPrice = teddyBearsCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        int trucksPrice = trucksCount * 2;

        double initialPrice = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        int toysCount = puzzlesCount + dollsCount + teddyBearsCount + minionsCount + trucksCount;

        if(toysCount >= 50) {
            initialPrice -= initialPrice * .25;
        }
        double finalPrice = initialPrice - initialPrice * .1;
        double result = finalPrice - vacationPrice;

        if(result >= 0) {
            System.out.printf("Yes! %.2f lv left.", result);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(result));
        }
    }
}