package PB_Exam;

import java.util.Scanner;

public class _03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packageKgs = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distanceKms = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double overCharge = 0;

        if(packageKgs < 1) {
            price = 3;
            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 3 * 0.8 * packageKgs;
            }
        } else if(packageKgs < 10) {
            price = 5;
            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 5 * 0.4 * packageKgs;
            }
        } else if(packageKgs < 40) {
            price = 10;
            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 10 * 0.05 * packageKgs;
            }
        } else if(packageKgs < 90) {
            price = 15;
            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 15 * 0.02 * packageKgs;
            }
        } else if(packageKgs < 150) {
            price = 20;
            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 20 * 0.01 * packageKgs;
            }
        }

        overCharge *= distanceKms;
        price *= distanceKms;

        double finalPrice = price + overCharge;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packageKgs, finalPrice / 100);
    }
}