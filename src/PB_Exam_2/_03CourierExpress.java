package PB_Exam_2;

import java.util.Scanner;

public class _03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double overCharge = 0;

        if(weight < 1) {
            price = 3;

            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 3 * .8 * weight;
            }
        } else if(weight < 10) {
            price = 5;

            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 5 * .4 * weight;
            }
        } else if(weight < 40) {
            price = 10;

            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 10 * .05 * weight;
            }
        } else if(weight < 90) {
            price = 15;

            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 15 * .02 * weight;
            }
        } else if(weight < 150) {
            price = 20;

            if(service.equals("standard")) {
                overCharge = 0;
            } else if(service.equals("express")) {
                overCharge = 20 * .01 * weight;
            }
        }

        overCharge *= distance;
        price *= distance;

        double finalPrice = price + overCharge;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, finalPrice / 100);
    }
}