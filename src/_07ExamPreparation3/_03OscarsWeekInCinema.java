package _07ExamPreparation3;

import java.util.Scanner;

public class _03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if(movie.equals("A Star Is Born")) {
            if(hall.equals("normal")) {
                price = 7.5;
            } else if(hall.equals("luxury")) {
                price = 10.5;
            } else if(hall.equals("ultra luxury")) {
                price = 13.5;
            }
        } else if(movie.equals("Bohemian Rhapsody")) {
            if(hall.equals("normal")) {
                price = 7.35;
            } else if(hall.equals("luxury")) {
                price = 9.45;
            } else if(hall.equals("ultra luxury")) {
                price = 12.75;
            }
        } else if(movie.equals("Green Book")) {
            if(hall.equals("normal")) {
                price = 8.15;
            } else if(hall.equals("luxury")) {
                price = 10.25;
            } else if(hall.equals("ultra luxury")) {
                price = 13.25;
            }
        } else if(movie.equals("The Favourite")) {
            if(hall.equals("normal")) {
                price = 8.75;
            } else if(hall.equals("luxury")) {
                price = 11.55;
            } else if(hall.equals("ultra luxury")) {
                price = 13.95;
            }
        }
        double cost = price * tickets;
        System.out.printf("%s -> %.2f lv.", movie, cost);
    }
}