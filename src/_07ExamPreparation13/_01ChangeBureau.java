package _07ExamPreparation13;

import java.util.Scanner;

public class _01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yens = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsToLeva = bitcoins * 1168;
        double yensToDollars = yens * 0.15;
        double yensToLeva = yensToDollars * 1.76;

        double amountInLeva = bitcoinsToLeva + yensToLeva;
        double commissionInLeva = commission / 100 * amountInLeva;
        amountInLeva -= commissionInLeva;

        double amountInEuro = amountInLeva /= 1.95;
        System.out.printf("%.2f", amountInEuro);
    }
}