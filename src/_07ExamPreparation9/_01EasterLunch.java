package _07ExamPreparation9;

import java.util.Scanner;

public class _01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunaks = Integer.parseInt(scanner.nextLine());
        int eggCrusts = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double priceKozunaks = kozunaks * 3.2;
        double priceEggCrust = eggCrusts * 4.35;
        double priceCookies = cookies * 5.4;
        double priceEggPaint = eggCrusts * 12 * 0.15;

        double total = priceKozunaks + priceEggCrust + priceCookies + priceEggPaint;
        System.out.printf("%.2f", total);
    }
}