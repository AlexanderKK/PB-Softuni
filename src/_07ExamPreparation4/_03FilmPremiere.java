package _07ExamPreparation4;

import java.util.Scanner;

public class _03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String filmPackage = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;
        boolean discountOne = false;
        boolean discountTwo = false;

        if(film.equals("John Wick")) {
            if(filmPackage.equals("Drink")) {
                price = 12;
            } else if(filmPackage.equals("Popcorn")) {
                price = 15;
            } else if(filmPackage.equals("Menu")) {
                price = 19;
            }
        } else if(film.equals("Star Wars")) {
            if(tickets >= 4) {
                discountOne = true;
            }

            if(filmPackage.equals("Drink")) {
                price = 18;
            } else if(filmPackage.equals("Popcorn")) {
                price = 25;
            } else if(filmPackage.equals("Menu")) {
                price = 30;
            }
        } else if(film.equals("Jumanji")) {
            if(tickets == 2) {
                discountTwo = true;
            }

            if(filmPackage.equals("Drink")) {
                price = 9;
            } else if(filmPackage.equals("Popcorn")) {
                price = 11;
            } else if(filmPackage.equals("Menu")) {
                price = 14;
            }
        }

        if(discountOne) {
            price *= .7;
        } else if(discountTwo) {
            price *= .85;
        }
        double bill = price * tickets;

        System.out.printf("Your bill is %.2f leva.", bill);
    }
}