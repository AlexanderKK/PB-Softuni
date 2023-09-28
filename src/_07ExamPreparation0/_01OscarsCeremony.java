package _07ExamPreparation0;

import java.util.Scanner;

public class _01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double figurinesPrice = rent - rent * .3;
        double cateringPrice = figurinesPrice - figurinesPrice * .15;
        double dubbingPrice = cateringPrice / 2;

        double cost = rent + figurinesPrice + cateringPrice + dubbingPrice;

        System.out.printf("%.2f%n", cost);
    }
}