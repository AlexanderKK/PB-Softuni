package _07ExamPreparation9;

import java.util.Scanner;

public class _03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nightsStayed = Integer.parseInt(scanner.nextLine());

        int pricePerNight = 0;
        if(destination.equals("France")) {
            if(dates.equals("21-23")) {
                pricePerNight = 30;
            } else if(dates.equals("24-27")) {
                pricePerNight = 35;
            } else if(dates.equals("28-31")) {
                pricePerNight = 40;
            }
        } else if(destination.equals("Italy")) {
            if(dates.equals("21-23")) {
                pricePerNight = 28;
            } else if(dates.equals("24-27")) {
                pricePerNight = 32;
            } else if(dates.equals("28-31")) {
                pricePerNight = 39;
            }
        } else if(destination.equals("Germany")) {
            if(dates.equals("21-23")) {
                pricePerNight = 32;
            } else if(dates.equals("24-27")) {
                pricePerNight = 37;
            } else if(dates.equals("28-31")) {
                pricePerNight = 43;
            }
        }
        double tripCost = pricePerNight * nightsStayed;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, tripCost);
    }
}