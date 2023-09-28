package PB_Exam;

import java.util.Scanner;

public class _01ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rollsPaper = Integer.parseInt(scanner.nextLine());
        int rollsFabric = Integer.parseInt(scanner.nextLine());
        double litersGlue = Double.parseDouble(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

        double priceRollsPaper = rollsPaper * 5.8;
        double priceRollsFabric = rollsFabric * 7.2;
        double priceGlue = litersGlue * 1.2;

        double cost = priceRollsPaper + priceRollsFabric + priceGlue;
        double discount = discountPercentage / 100.0 * cost;

        double totalCost = cost - discount;
        System.out.printf("%.3f", totalCost);
    }
}