package _07ExamPreparation5;

import java.util.Scanner;

public class _01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double cinemaTax = Double.parseDouble(scanner.nextLine());

        double pureProfit = days * tickets * ticketPrice;
        double profit = pureProfit - pureProfit * cinemaTax / 100;

        System.out.printf("The profit from the movie %s is %.2f lv.", movie, profit);
    }
}