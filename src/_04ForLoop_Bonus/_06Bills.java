package _04ForLoop_Bonus;

import java.util.Scanner;

public class _06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        int water = 20;
        int internet = 15;

        double sumEl = 0;
        double sumWater = 0;
        double sumInternet = 0;
        double sumOther = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            sumEl += electricity;
            sumWater += water;
            sumInternet += internet;
            sumOther += (electricity + water + internet) * 1.2;
        }
        double sumBills = sumEl + sumWater + sumInternet + sumOther;

        double sumAverageBillsPerMonth = sumBills / months;

        System.out.printf("Electricity: %.2f lv%n", sumEl);
        System.out.printf("Water: %.2f lv%n", sumWater);
        System.out.printf("Internet: %.2f lv%n", sumInternet);
        System.out.printf("Other: %.2f lv%n", sumOther);
        System.out.printf("Average: %.2f lv%n", sumAverageBillsPerMonth);
    }
}