package _07ExamPreparation0;

import java.util.Scanner;

public class _03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        char trophyPhoto = scanner.nextLine().charAt(0);

        double price = 0;
        if(stage.equals("Quarter final")) {
            if(ticketType.equals("Standard")) {
                price = tickets * 55.5;
            } else if(ticketType.equals("Premium")) {
                price = tickets * 105.2;
            } else if(ticketType.equals("VIP")) {
                price = tickets * 118.9;
            }
        } else if(stage.equals("Semi final")) {
            if(ticketType.equals("Standard")) {
                price = tickets * 75.88;
            } else if(ticketType.equals("Premium")) {
                price = tickets * 125.22;
            } else if(ticketType.equals("VIP")) {
                price = tickets * 300.4;
            }
        } else if(stage.equals("Final")) {
            if(ticketType.equals("Standard")) {
                price = tickets * 110.1;
            } else if(ticketType.equals("Premium")) {
                price = tickets * 160.66;
            } else if(ticketType.equals("VIP")) {
                price = tickets * 400;
            }
        }

        boolean freePhotos = false;
        if(price > 4000) {
            price *= .75;
            freePhotos = true;
        } else if(price > 2500) {
            price *= .9;
        }

        if(trophyPhoto == 'Y' && !freePhotos) {
            price += tickets * 40;
        }

        System.out.printf("%.2f", price);
    }
}