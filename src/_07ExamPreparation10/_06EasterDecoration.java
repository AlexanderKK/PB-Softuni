package _07ExamPreparation10;

import java.util.Scanner;

public class _06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());
        double totalCost = 0;

        for (int i = 0; i < customers; i++) {
            String command = scanner.nextLine();
            int purchases = 0;
            double cost = 0;

            while(!command.equals("Finish")) {
                String purchase = command;

                if(purchase.equals("basket")) {
                    cost += 1.5;
                } else if(purchase.equals("wreath")) {
                    cost +=  3.8;
                } else if(purchase.equals("chocolate bunny")) {
                    cost += 7;
                }
                purchases++;

                command = scanner.nextLine();
            }
            if(purchases % 2 == 0) {
                cost *= 0.8;
            }
            totalCost += cost;

            System.out.printf("You purchased %d items for %.2f leva.%n", purchases, cost);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalCost / customers);
    }
}