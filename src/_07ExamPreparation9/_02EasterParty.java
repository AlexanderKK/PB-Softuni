package _07ExamPreparation9;

import java.util.Scanner;

public class _02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        double desiBudget = Double.parseDouble(scanner.nextLine());

        if(guests >= 10) {
            if(guests <= 15) {
                pricePerCover *= .85;
            } else if(guests <= 20) {
                pricePerCover *= .8;
            } else {
                pricePerCover *= .75;
            }
        }
        double priceCake = desiBudget * .1;
        double totalCost = pricePerCover * guests + priceCake;
        double diff = totalCost - desiBudget;
        if(diff <= 0) {
            System.out.printf("It is party time! %.2f leva left.", Math.abs(diff));
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}