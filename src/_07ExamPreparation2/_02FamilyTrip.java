package _07ExamPreparation2;

import java.util.Scanner;

public class _02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int expensesPercentage = Integer.parseInt(scanner.nextLine());

        if(nights > 7) {
            pricePerNight *= .95;
        }
        double cost = nights * pricePerNight + expensesPercentage / 100.0 * budget;
        double diff = cost - budget;

        if(diff <= 0) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(diff));
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}