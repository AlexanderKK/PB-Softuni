package _01FirstSteps_Exercise;

import java.util.Scanner;

public class _07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double price = chickenMenus * 10.35 + fishMenus * 12.40 + vegetarianMenus * 8.15;
        double dessertPrice = price * 0.2;
        double finalPrice = price + dessertPrice + 2.50;

        System.out.println(finalPrice);
    }
}