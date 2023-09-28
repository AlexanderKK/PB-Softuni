package PB_Exam_2;

import java.util.Scanner;

public class _01ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paperRolls = Integer.parseInt(scanner.nextLine());
        int fabricRolls = Integer.parseInt(scanner.nextLine());
        double litersGlue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double paperRollsPrice = paperRolls * 5.8;
        double fabricRollsPrice = fabricRolls * 7.2;
        double litersGluePrice = litersGlue * 1.2;

        double totalPrice = paperRollsPrice + fabricRollsPrice + litersGluePrice;
        totalPrice -= totalPrice * (discount / 100.0);

        System.out.printf("%.3f", totalPrice);
    }
}