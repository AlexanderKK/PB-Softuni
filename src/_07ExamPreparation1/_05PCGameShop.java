package _07ExamPreparation1;

import java.util.Scanner;

public class _05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesSold = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 1; i <= gamesSold; i++) {
            String game = scanner.nextLine();

            if(game.equals("Hearthstone")) {
                sum1 ++;
            } else if(game.equals("Fornite")) {
                sum2++;
            } else if(game.equals("Overwatch")) {
                sum3++;
            } else {
                sum4++;
            }
        }

        System.out.printf("Hearthstone - %.2f%%%n", 1.0 * sum1 / gamesSold * 100);
        System.out.printf("Fornite - %.2f%%%n", 1.0 * sum2 / gamesSold * 100);
        System.out.printf("Overwatch - %.2f%%%n", 1.0 * sum3 / gamesSold * 100);
        System.out.printf("Others - %.2f%%", 1.0 * sum4 / gamesSold * 100);
    }
}