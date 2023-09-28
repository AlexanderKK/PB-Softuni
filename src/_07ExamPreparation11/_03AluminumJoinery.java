package _07ExamPreparation11;

import java.util.Scanner;

public class _03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joiners = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price = 0;
        boolean invalidOrder = joiners < 10;
        if(invalidOrder) {
            System.out.println("Invalid order");
        } else {
            if (type.equals("90X130")) {
                price = 110;
                if (joiners > 60) {
                    price *= .92;
                } else if (joiners > 30) {
                    price *= .95;
                }
            } else if (type.equals("100X150")) {
                price = 140;
                if (joiners > 80) {
                    price *= .9;
                } else if (joiners > 40) {
                    price *= .94;
                }
            } else if (type.equals("130X180")) {
                price = 190;
                if (joiners > 50) {
                    price *= .88;
                } else if (joiners > 20) {
                    price *= .93;
                }
            } else if (type.equals("200X300")) {
                price = 250;
                if (joiners > 50) {
                    price *= .86;
                } else if (joiners > 25) {
                    price *= .91;
                }
            }
            price *= joiners;

            if (delivery.equals("With delivery")) {
                price += 60;
            }
            if (joiners > 99) {
                price *= 0.96;
            }
            System.out.printf("%.2f BGN", price);
        }
    }
}