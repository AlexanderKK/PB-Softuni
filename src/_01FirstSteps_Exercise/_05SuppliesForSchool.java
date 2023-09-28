package _01FirstSteps_Exercise;

import java.util.Scanner;

public class _05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int chemicals = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double price = pens * 5.80 + markers * 7.20 + chemicals * 1.20;
        double finalPrice = price - (price * discount / 100);

        System.out.println(finalPrice);
    }
}