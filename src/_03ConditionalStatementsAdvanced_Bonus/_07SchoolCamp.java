package _03ConditionalStatementsAdvanced_Bonus;

import java.util.Scanner;

public class _07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        String sports = "";

        if(season.equals("Winter")) {
            if(groupType.equals("boys") || groupType.equals("girls")) {
                pricePerNight = 9.6;
            } else if(groupType.equals("mixed")) {
                pricePerNight = 10;
            }

            if(groupType.equals("boys")) {
                sports = "Judo";
            } else if(groupType.equals("girls")) {
                sports = "Gymnastics";
            } else if(groupType.equals("mixed")) {
                sports = "Ski";
            }
        } else if(season.equals("Spring")) {
            if(groupType.equals("boys") || groupType.equals("girls")) {
                pricePerNight = 7.2;
            } else if(groupType.equals("mixed")) {
                pricePerNight = 9.5;
            }

            if(groupType.equals("boys")) {
                sports = "Tennis";
            } else if(groupType.equals("girls")) {
                sports = "Athletics";
            } else if(groupType.equals("mixed")) {
                sports = "Cycling";
            }
        } else if(season.equals("Summer")) {
            if(groupType.equals("boys") || groupType.equals("girls")) {
                pricePerNight = 15;
            } else if(groupType.equals("mixed")) {
                pricePerNight = 20;
            }

            if(groupType.equals("boys")) {
                sports = "Football";
            } else if(groupType.equals("girls")) {
                sports = "Volleyball";
            } else if(groupType.equals("mixed")) {
                sports = "Swimming";
            }
        }
        double price = pricePerNight * nights * students;

        double discount = 0;
        if(students >= 50) {
            discount = price * .5;
        } else if(students >= 20) {
            discount = price * .15;
        } else if(students >= 10) {
            discount = price * .05;
        }
        price -= discount;

        System.out.printf("%s %.2f lv.", sports, price);
    }
}