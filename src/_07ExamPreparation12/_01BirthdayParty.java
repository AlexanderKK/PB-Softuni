package _07ExamPreparation12;

import java.util.Scanner;

public class _01BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cakePrice = rent * .2;
        double drinksPrice = cakePrice * .55;
        double animatorPrice = rent / 3;

        double budget = rent + cakePrice + drinksPrice + animatorPrice;

        System.out.printf("%.1f", budget);
    }
}