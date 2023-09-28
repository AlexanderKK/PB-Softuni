package PB_Exam_Review;

import java.util.Scanner;

public class _01ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paperRolls = Integer.parseInt(scanner.nextLine());
        int fabricRolls = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double paperCost = paperRolls * 5.8;
        double fabricCost = fabricRolls * 7.2;
        double glueCost = glueLiters * 1.2;

        double totalCost = (paperCost + fabricCost + glueCost) * (1 - discount / 100.0);
        System.out.printf("%.3f", totalCost);
    }
}