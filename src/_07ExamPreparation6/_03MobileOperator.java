package _07ExamPreparation6;

import java.util.Scanner;

public class _03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractYears = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileData = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if(contractYears.equals("one")) {
            if(contractType.equals("Small")) {
                price = 9.98;
            } else if(contractType.equals("Middle")) {
                price = 18.99;
            } else if(contractType.equals("Large")) {
                price = 25.98;
            } else if(contractType.equals("ExtraLarge")) {
                price = 35.99;
            }
        } else if(contractYears.equals("two")) {
            if(contractType.equals("Small")) {
                price = 8.58;
            } else if(contractType.equals("Middle")) {
                price = 17.09;
            } else if(contractType.equals("Large")) {
                price = 23.59;
            } else if(contractType.equals("ExtraLarge")) {
                price = 31.79;
            }
        }

        if(mobileData.equals("yes")) {
            if(price <= 10) {
                price += 5.5;
            } else if(price <= 30) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }

        double finalPrice = price * months;
        if(contractYears.equals("two")) {
            finalPrice -= finalPrice * 3.75 / 100;
        }

        System.out.printf("%.2f lv.", finalPrice);
    }
}