package _01FirstSteps_Exercise;

import java.util.Scanner;

public class _03DepositCalculator {
    public static void main(String[] args) {
/*
        1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
        2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
        3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]
*/
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());

        int months = Integer.parseInt(scanner.nextLine());

        double interest = Double.parseDouble(scanner.nextLine());

        double total = deposit + months * ((deposit * (interest / 100)) / 12);

        System.out.println(total);
    }
}