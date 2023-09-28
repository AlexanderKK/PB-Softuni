package _04ForLoop_Exercise;

import java.util.Scanner;

public class _04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        double income = 0;
        int toys = 0;
        int counter = 1;
        for (int i = 1; i <= age; i++) {
            if(i % 2 == 0) {
                income += 10 * counter;
                counter++;
                income--;
            } else {
                toys++;
            }
        }

        double toysIncome = toys * pricePerToy;
        income += toysIncome;

        double balance = Math.abs(income - priceWashMachine);
        if(income >= priceWashMachine) {
            System.out.printf("Yes! %.2f", balance);
        } else {
            System.out.printf("No! %.2f", balance);
        }
    }
}