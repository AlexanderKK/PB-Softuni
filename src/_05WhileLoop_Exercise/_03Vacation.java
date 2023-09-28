package _05WhileLoop_Exercise;

import java.util.Scanner;

public class _03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        int daysSpend = 0;
        int days = 0;
        boolean hasNotSaved = false;

        while(budget < moneyNeeded) {
            String choice = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            if(choice.equals("spend")) {
                budget -= amount;
                if(budget < 0) {
                    budget = 0;
                }
                daysSpend++;
            } else if(choice.equals("save")) {
                budget += amount;
                daysSpend = 0;
            }

            days++;

            if(daysSpend == 5) {
                hasNotSaved = true;
                break;
            }
        }

        if(hasNotSaved) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}