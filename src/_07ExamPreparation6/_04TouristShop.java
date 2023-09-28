package _07ExamPreparation6;

import java.util.Scanner;

public class _04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fund = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        int productsCount = 0;
        double sumProductsPrice = 0;
        boolean isNotAffordable = false;
        while(!command.equals("Stop")) {
            String product = command;
            double price = Double.parseDouble(scanner.nextLine());

            productsCount++;
            if(productsCount % 3 == 0) {
                price /= 2;
            }
            sumProductsPrice += price;
            if(fund < sumProductsPrice) {
                isNotAffordable = true;
                break;
            }

            command = scanner.nextLine();
        }

        if(isNotAffordable) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", sumProductsPrice - fund);
        } else {
            System.out.printf("You bought %d products for %.2f leva.", productsCount, sumProductsPrice);
        }
    }
}