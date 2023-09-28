package _07ExamPreparation12;

import java.util.Scanner;

public class _03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitFlavour = scanner.nextLine();
        String set = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (fruitFlavour.equals("Watermelon")) {
            if (set.equals("small")) {
                price = 56 * 2;
            } else if (set.equals("big")) {
                price = 28.7 * 5;
            }
        } else if (fruitFlavour.equals("Mango")) {
            if (set.equals("small")) {
                price = 36.66 * 2;
            } else if (set.equals("big")) {
                price = 19.6 * 5;
            }
        } else if (fruitFlavour.equals("Pineapple")) {
            if (set.equals("small")) {
                price = 42.1 * 2;
            } else if (set.equals("big")) {
                price = 24.8 * 5;
            }
        } else if (fruitFlavour.equals("Raspberry")) {
            if (set.equals("small")) {
                price = 20 * 2;
            } else if (set.equals("big")) {
                price = 15.2 * 5;
            }
        }

        price *= quantity;
        if(price >= 400 && price <= 1000) {
            price *= .85;
        } else if(price > 1000) {
            price /= 2;
        }
        System.out.printf("%.2f lv.", price);
    }
}