package PB_Exam_Review;

import java.util.Scanner;

public class _03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double packageWeight = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distanceKm = Integer.parseInt(scanner.nextLine());

        double pricePerKm = 0;
        double overcharge = 0;
        if(packageWeight < 1) {
            pricePerKm = 3;

            if(serviceType.equals("express")) {
                overcharge = pricePerKm * 0.8 * packageWeight;
            }
        } else if(packageWeight <= 10) {
            pricePerKm = 5;

            if(serviceType.equals("express")) {
                overcharge = pricePerKm * 0.4 * packageWeight;
            }
        } else if(packageWeight <= 40) {
            pricePerKm = 10;

            if(serviceType.equals("express")) {
                overcharge = pricePerKm * 0.05 * packageWeight;
            }
        } else if(packageWeight <= 90) {
            pricePerKm = 15;

            if(serviceType.equals("express")) {
                overcharge = pricePerKm * 0.02 * packageWeight;
            }
        } else if(packageWeight <= 150) {
            pricePerKm = 20;

            if(serviceType.equals("express")) {
                overcharge = pricePerKm * 0.01 * packageWeight;
            }
        }

        double price = (pricePerKm * distanceKm + overcharge * distanceKm) / 100;

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packageWeight, price);
    }
}