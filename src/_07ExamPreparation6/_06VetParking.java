package _07ExamPreparation6;

import java.util.Scanner;

public class _06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double price;
        double totalPrice = 0;
        for (int i = 1; i <= days; i++) {
            double dailyPrice = 0;
            for (int j = 1; j <= hours; j++) {
                if(i % 2 == 0 && j % 2 != 0) {
                    price = 2.5;
                } else if(i % 2 != 0 && j % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1;
                }
                dailyPrice += price;
            }
            totalPrice += dailyPrice;
            System.out.printf("Day: %d - %.2f leva%n", i, dailyPrice);
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}