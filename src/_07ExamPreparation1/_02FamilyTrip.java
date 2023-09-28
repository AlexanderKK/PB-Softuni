package _07ExamPreparation1;

import java.util.Scanner;

public class _02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int otherExpenses = Integer.parseInt(scanner.nextLine());

        if(nights > 7) {
            pricePerNight *= .95;
        }
        double cost = nights * pricePerNight + otherExpenses / 100.0 * budget;
        double diff = Math.abs(cost - budget);

        if(cost <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }
}