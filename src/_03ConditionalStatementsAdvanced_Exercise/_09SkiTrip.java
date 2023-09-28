package _03ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class _09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        boolean isApartment = false;
        boolean isPresidential = false;

        if(roomType.equals("room for one person")) {
            price = nights * 18;
        } else if(roomType.equals("apartment")) {
            price = nights * 25;
            isApartment = true;
        } else if(roomType.equals("president apartment")) {
            price = nights * 35;
            isPresidential = true;
        }

        if(isApartment) {
            if(days < 10) {
                price -= price * .3;
            } else if(days <= 15) {
                price -= price * .35;
            } else {
                price -= price * .5;
            }
        } else if(isPresidential) {
            if(days < 10) {
                price -= price * .1;
            } else if(days <= 15) {
                price -= price * .15;
            } else {
                price -= price * .2;
            }
        }

        if(review.equals("positive")) {
            price += price * .25;
        } else if(review.equals("negative")) {
            price -= price * .1;
        }

        System.out.printf("%.2f", price);
    }
}