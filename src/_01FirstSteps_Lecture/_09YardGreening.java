package _01FirstSteps_Lecture;

import java.util.Scanner;

public class _09YardGreening {
    public static void main(String[] args) {
        double sqMeters;
        double discount;
        double total;
        do {
            Scanner scanner = new Scanner(System.in);

            sqMeters = Double.parseDouble(scanner.nextLine());

            double amount = sqMeters * 7.61;

            discount = amount * 0.18;

            total = amount - discount;
        } while(sqMeters < 0.00 || sqMeters > 10000.00);

        System.out.printf("The final price is: %.2f lv.%n", total);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}