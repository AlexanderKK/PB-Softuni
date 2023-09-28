package _07ExamPreparation8;

import java.util.*;

public class _03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        String trophyPhoto = scanner.nextLine();

        double price = 0;
        if(stage.equals("Quarter final")) {
            if(ticketType.equals("Standard")) {
                price = 55.5;
            } else if(ticketType.equals("Premium")) {
                price = 105.2;
            } else if(ticketType.equals("VIP")) {
                price = 118.9;
            }
        } else if(stage.equals("Semi final")) {
            if(ticketType.equals("Standard")) {
                price = 75.88;
            } else if(ticketType.equals("Premium")) {
                price = 125.22;
            } else if(ticketType.equals("VIP")) {
                price = 300.4;
            }
        } else if(stage.equals("Final")) {
            if(ticketType.equals("Standard")) {
                price = 110.1;
            } else if(ticketType.equals("Premium")) {
                price = 160.66;
            } else if(ticketType.equals("VIP")) {
                price = 400;
            }
        }

        boolean freePhoto = false;
        price *= tickets;
        if(price > 4000) {
            price *= .75;
            freePhoto = true;
        } else if(price > 2500) {
            price *= .9;
        }

        if(!freePhoto && trophyPhoto.equals("Y")) {
            price += tickets * 40;
        }

        System.out.printf("%.2f", price);
    }
}