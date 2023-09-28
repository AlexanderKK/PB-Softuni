package _06NestedLoops_Lecture;

import java.util.Scanner;

public class _05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while(!command.equals("End")) {
            String destination = command;
            double budget = Double.parseDouble(scanner.nextLine());

            for (double amount = 0; amount < budget; amount++) {
                if(amount > 0) {
                    amount--;
                }
                amount += Double.parseDouble(scanner.nextLine());

                if(amount >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }

//          double amount = 0;
//          while(amount < budget) {
//              amount += Double.parseDouble(scanner.nextLine());
//          }
//          System.out.printf("Going to %s!%n", destination);

            command = scanner.nextLine();
        }
    }
}