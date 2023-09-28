package _07ExamPreparation3;

import java.util.Scanner;

public class _04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherAmount = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int sumTickets = 0;
        int sumProducts = 0;

        while (!input.equals("End")) {
            String product = input;

            int amount;
            if (product.length() > 8) {
                amount = product.charAt(0) + product.charAt(1);

                voucherAmount -= amount;
                if (voucherAmount >= 0) {
                    sumTickets++;
                }
            } else {
                amount = product.charAt(0);

                voucherAmount -= amount;
                if (voucherAmount >= 0) {
                    sumProducts++;
                }
            }

            if (voucherAmount < 0) {
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%d%n", sumTickets);
        System.out.printf("%d", sumProducts);
    }
}