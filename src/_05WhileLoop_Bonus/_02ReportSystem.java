package _05WhileLoop_Bonus;

import java.util.Scanner;

public class _02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int charityGoal = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int payCount = 0;
        int sumCash = 0;
        int sumCreditCard = 0;
        int transactionsCS = 0;
        int transactionsCC = 0;
        boolean isEnough = false;

        while(!input.equals("End")) {
            int price = Integer.parseInt(input);
            payCount++;
            boolean isSold = false;

            if(payCount % 2 != 0) {
                if(price <= 100) {
                    sumCash += price;
                    transactionsCS++;
                    isSold = true;
                }
            } else {
                if(price >= 10) {
                    sumCreditCard += price;
                    transactionsCC++;
                    isSold = true;
                }
            }

            if(isSold) {
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }

            if(sumCash + sumCreditCard >= charityGoal) {
                isEnough = true;
                break;
            }

            input = scanner.nextLine();
        }

        if(isEnough) {
            double avgCash = 0;
            double avgCreditCard = 0;

            avgCash = sumCash * 1.0 / transactionsCS;
            avgCreditCard = sumCreditCard * 1.0 / transactionsCC;

            System.out.printf("Average CS: %.2f%n", avgCash);
            System.out.printf("Average CC: %.2f", avgCreditCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}